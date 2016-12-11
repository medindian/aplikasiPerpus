package Model;

//import java.text.*;
import database.Database;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Aplikasi {
    
    private ArrayList<Pendaftaran> listPendaftaran;// = new Pendaftaran();
    private static int kode = 1;
    private static int kdBuku = 1;
    private static int kdPinjam = 1;
    private static int kdDenda = 1;
    private Database db;
    private ArrayList<Buku> listBuku;// = new ArrayList<Buku>();
    private ArrayList<Anggota> listAnggota;
//    private FileIO database;
    private String passAdmin = "123456";

    public Aplikasi() {
//        db = new Database();
//        db.connect();
        System.out.println("Bisa connect");
//        database = new FileIO();
        this.listPendaftaran = new ArrayList<>();
        this.listAnggota = new ArrayList<>();//pendaftaran.getAnggota();//db.readDataAnggota();
        this.listBuku = new ArrayList<>();//new ArrayList<Buku>();//db.readDataBuku();
    }
    
    public Database getDB(){
        return db;
    }

    public void setListPendaftaran(ArrayList<Pendaftaran> listPendaftaran) {
        this.listPendaftaran = listPendaftaran;
    }

    public void setListBuku(ArrayList<Buku> listBuku) {
        this.listBuku = listBuku;
    }

    public void setListAnggota(ArrayList<Anggota> listAnggota) {
        this.listAnggota = listAnggota;
    }
    
//    public void listTahun() throws ParseException{
//	Date dt = new Date();
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(dt);
//        int year = cal.get(Calendar.YEAR);
//        ArrayList<Integer> daftarTahun = new ArrayList<>();
////        System.out.println(year);
//        while (year >= 1850){
//            daftarTahun.add(year);
////            System.out.println(year);
//            year = year -1;
//        }
//        for (int i = 0; i < daftarTahun.size(); i++){
//            System.out.println(daftarTahun.get(i));
//        }
////        return daftarTahun;
//    }
    
    //menu validasi admin untuk mengakses menu-menu utama aplikasi
//    public void validasiAdmin(String pass){
//        if (pass.equals(passAdmin))
//            System.out.println("Selamat datang admin");
//        else
//            System.out.println("Password anda salah");
//    }
            
    //menu mendaftarkan anggota baru
    public String tambahAnggota(String nama, String alamat, String noTelp, String email){
        Aplikasi.kode = kode+1;
        int g = -2;
        Pendaftaran pdf = null;
        pdf.daftarAnggotaBaru(nama, alamat, noTelp, email, Aplikasi.kode);
        this.listPendaftaran.add(pdf);
        db.savePendaftaran(pdf);
        if (listAnggota.isEmpty()){
            this.listAnggota.add(this.listPendaftaran.get(0).getAnggota());
            db.saveAnggota(this.listAnggota.get(0));
        } else {
            for (int i = 0; i < listAnggota.size(); i++){
                Anggota a = (Anggota) listAnggota.get(i);
                if (!a.getNama().equals(nama) || !a.getEmail().equals(email))
                    g = i;
                else{
                    g = -1;
                    if (a.getNama().equals(nama))
                        return("Nama sudah terdaftar");
                    else
                        return("E-mail sudah terdaftar");
                }   }
            if (g > -1){
                int n = cariAnggotaDiPendaftaran(nama, alamat, noTelp, email);
                this.listAnggota.add(this.listPendaftaran.get(n).getAnggota());
                int k = cariAnggota(nama, alamat, noTelp, email);
                db.saveAnggota(this.listAnggota.get(k));
            }
        }
        return("Pendaftaran berhasil dilakukan");
    }
    
    public int cariAnggotaDiPendaftaran(String nama, String alamat, String noTelp, String email){
        int dpt = -1;  
        for (int i = 0; i < listPendaftaran.size(); i++){
            Anggota ag = (Anggota) listPendaftaran.get(i).getAnggota();
            if (ag.getNama().equals(nama) && ag.getAlamat().equals(alamat) && ag.getNoTelp().equals(noTelp)
                    && ag.getEmail().equals(email))
                dpt = i;
        }
        return dpt;
    }
    
    public ArrayList<Pendaftaran> getListPendaftaran(){
        return listPendaftaran;
    }
    
    public int cariAnggota(String nama, String alamat, String noTelp, String email){
        int dpt = -1;        
        for (int i = 0; i < listAnggota.size(); i++){
            Anggota ag = (Anggota) listAnggota.get(i);
            if (ag.getNama().equals(nama) && ag.getAlamat().equals(alamat) && ag.getNoTelp().equals(noTelp)
                    && ag.getEmail().equals(email))
                dpt = i;
        }
        return dpt;
    }
    
    //menu pengadaan buku
//    public String tambahBuku(String judul, String pengarang, String penerbit, String kodeBuku, String sinopsis, int tahunTerbit, int jmlBuku){
    public String tambahBuku(String judul, String pengarang, String penerbit, String kodeBuku, int tahunTerbit, int jmlBuku){
        Buku bk = new Buku(judul, pengarang, penerbit, kodeBuku, //sinopsis,
                tahunTerbit, jmlBuku);
        listBuku.add(bk);
        boolean cari = cariBukuByJudulPenulis(judul, pengarang);
        if (cari == true){
            return("Buku berhasil disimpan");
        }
        return("Buku tidak berhasil disimpan");
    }
    
    //untuk mendapatkan obj2 Buku yg ada pada listBuku
    public ArrayList<Buku> getListBuku(){
        return listBuku;    }
    
    //untuk mendapatkan obj2 anggota dari listAnggota
    public ArrayList<Anggota> getListAnggota(){
        return listAnggota; }
    
    //untuk mencari buku berdasarkan judul buku
    public ArrayList cariBukuByJudul(String judulBuku){
        Buku cari;
        ArrayList arBuku = new ArrayList<Buku>();
        int arrBuku = -1;
        boolean stat = false;
//        System.out.println("Hasil pencarian buku dengan judul "+judulBuku);
        for (int i = 0; i < listBuku.size(); i++){
            cari = (Buku) listBuku.get(i); //System.out.println(i);
            String words[] = cari.getJudul().split(" ");
            int j = 0;
            while (j != words.length){
                if (words[j].equals(judulBuku)){
                    stat = true;
                    arBuku.add(cari);
                    //cari.previewBuku();
                } j = j + 1;    }   }
        if (stat == false)
            System.out.println("Buku tidak tersedia");
        return arBuku;    }
    
    //untuk mencari buku berdasarkan penulisnya
    public ArrayList cariBukuByPenulis(String penulis){
        Buku cari;
        ArrayList arBuku = new ArrayList<Buku>();
        boolean stat = false;
        int arrBuku = -1;
//        System.out.println("Hasil pencarian buku dengan nama penulis "+penulis);
        for (int i = 0; i < listBuku.size(); i++){
            cari = (Buku) listBuku.get(i); //System.out.println(i);
            String words[] = cari.getPengarang().split(" ");
            int j = 0;
            while (j != words.length){
                if (words[j].equals(penulis)){
                    stat = true;
                    arBuku.add(cari);
                    //cari.previewBuku();
                } j = j+1;  }   }
        if (stat == false)
            System.out.println("Buku tidak tersedia");
        return arBuku;
    }
        
    //untuk mencari status keberadaan data sebuah buku berdasarkan judul atau penulis buku
    public boolean cariBukuByJudulPenulis(String judulBuku, String penulis){
        int ketemu = cariBukuByJudul(judulBuku).size();
        int found = cariBukuByPenulis(penulis).size();
        return ketemu > 0 || found > 0;    }
    
    //untuk mencari array dari data sebuah buku berdasarkan kode buku
    public int cariArrayBukuByKode(String kodeBuku){
        Buku cari;
        int arrBuku = -1;
        for (int i = 0; i < listBuku.size(); i++){
            cari = (Buku) listBuku.get(i);
            if ( (cari.getKodeBuku()).equals(kodeBuku) )
                arrBuku = i;
        } return arrBuku;   }
    
    //untuk mencari keberadaan data sebuah buku berdasarkan kode buku
    public boolean cariBukuByKode(String kodeBuku){
        int ketemu = cariArrayBukuByKode(kodeBuku);
        return ketemu != -1;    }
    
    //menu mencari buku
    public ArrayList cariBuku(String cari, int dsrCari){
        boolean stat = cariBukuByJudulPenulis(cari, cari);
        ArrayList listBk = new ArrayList<Buku>();
        if (stat == true){
            if(dsrCari == 1)
                listBk = cariBukuByJudul(cari);
            else
                listBk = cariBukuByPenulis(cari); }
        else
            System.out.println("Buku tidak tersedia");
        return listBk;    }
        
    //untuk mencari array dari data seorang anggota perpus berdasarkan kode anggota
    public int cariArrayAnggotaByKode(String kodeAnggota){
        Anggota cari;
        int arrAg = -1;
        for (int i = 0; i < listAnggota.size(); i++){
            cari = (Anggota) listAnggota.get(i);
            if ( (cari.getKodeAnggota()).equals(kodeAnggota) ){
                arrAg = i;  }
        } return arrAg;   }
    
    //untuk mencari keberadaan data anggota perpustakaan berdasarkan kode anggota
    public boolean cariAnggotaByKode(String kodeAnggota){
        int ketemu = cariArrayAnggotaByKode(kodeAnggota);
        return ketemu != -1;    }
    
    //menu meminjam buku
    public String PeminjamanBuku(String kodeAnggota, String kodeBuku, String kodePinjam){
        String statement = "Dokumentasi peminjaman gagal disimpan";
        int arAgt = cariArrayAnggotaByKode(kodeAnggota);
        int arBk = cariArrayBukuByKode(kodeBuku);
        if (arBk == -1){
            statement = "Data buku belum terdaftar";
        }else if (arAgt == -1) {
            statement = "data anggota perpustakaan belum terdaftar, silahkan "+
                    " melakukan pendaftaran terlebih dahulu";
        }else {
            Anggota peminjam = (Anggota) listAnggota.get(arAgt);
            Buku bk = (Buku) listBuku.get(arBk);
            Date tglPinjam = new Date();
            Peminjaman pinjam = new Peminjaman(bk, kodePinjam, tglPinjam);
            peminjam.melakukanPeminjamanBuku(pinjam);
            if (peminjam.cariPeminjaman(kodePinjam) != -1){
                long jmlBukuDulu = bk.getJumlahBuku(); // System.out.println("jmlBukuBefore : "+jmlBukuDulu);
                bk.bukuDipinjam();
                long jmlBukuSekarang = bk.getJumlahBuku(); // System.out.println("jmlBukuAfter : "+jmlBukuSekarang);
                statement = "Dokumentasi peminjaman sudah tersimpan";   }
//            else
//                statement = "Dokumentasi peminjaman gagal disimpan";
        }
        return statement; }
    
    public int cariPeminjaman(String kodePeminjam, String kodePeminjaman){
        int i = cariArrayAnggotaByKode(kodePeminjam);
        Anggota peminjam = listAnggota.get(i);
        int cariData = peminjam.cariPeminjaman(kodePeminjaman);
        return cariData;
    }
    
    //menampilkan seluruh daftar anggota
    public void viewSemuaListAnggota(){
        if (listAnggota.isEmpty()){
            System.out.println("Belum ada anggota perpustakaan yang terdaftar");    }
        for (int i = 0; i < listAnggota.size(); i++){
            Anggota a = (Anggota) listAnggota.get(i);
            a.viewBiodata();    }   }
    
    //menampilkan seluruh daftar buku
    public String viewSemuaListBuku(){
        int no = 0;
        String statement = "Error";
        //System.out.println("----------- Daftar Buku -----------");
        if (listBuku.isEmpty()){
            statement = ("Belum ada buku yang terdaftar");    }
        for (int i = 0; i < listBuku.size(); i++){
            Buku bk = (Buku) listBuku.get(i);
            no = no + 1;
            statement = (no+". Judul : "+bk.getJudul() +"\n"
                    +"   Penulis : "+bk.getPengarang());
        } //System.out.println("-----------------------------------");
        return statement;
    }
    
    //menu mengembalikan buku
    public String PengembalianBuku(String kodeAnggota, String kodePeminjaman){
        Date tglBalik = new Date();
        String statement = "Anda salah memasukkan kode anggota";
        Anggota peminjam;
        int statA = cariArrayAnggotaByKode(kodeAnggota);
        if (statA != -1){
            peminjam = (Anggota) listAnggota.get(statA);
            boolean cek = peminjam.melakukanPengembalian(kodePeminjaman, tglBalik);
            if (cek == true)
                statement = "Dokumentasi pengembalian buku berhasil disimpan";
            else
                statement = "Dokumentasi pengembalian buku gagal disimpan";
        } return statement;    }
    
    //menu membayar denda
    public boolean BayarDenda(String kodeAnggota, String kodePeminjaman, long dendaDibayar){
        boolean cek = false;
        Anggota peminjam;
        int statA = cariArrayAnggotaByKode(kodeAnggota);
        if (statA == -1){
            System.out.println("Anda salah memasukkan kode anggota");
        } else {
            peminjam = (Anggota) listAnggota.get(statA);
            cek = peminjam.bayarDenda(kodePeminjaman, dendaDibayar);
            System.out.println("Dokumentasi denda berhasil disimpan");
        } return cek;    }
        
}
