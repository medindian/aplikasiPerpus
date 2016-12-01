package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Aplikasi {
    
    private Pendaftaran pendaftaran = new Pendaftaran();
    private static int kode = 0;
    private ArrayList listBuku = new ArrayList<Buku>();
    private ArrayList listAnggota;

    public Aplikasi() {
//        this.pendaftaran = new Pendaftaran();
        this.listAnggota = pendaftaran.getAnggota();
//        this.listBuku = new ArrayList<Buku>();
    }
    
    // yg akan membuat objek anggota
    public void tambahAnggota(String nama, String alamat, String noTelp, String email){
        this.kode = kode+1;
        int g = -2;
        if (listAnggota.isEmpty()){
            pendaftaran.daftarAnggotaBaru(nama, alamat, noTelp, email, this.kode);  }
        else{
            for (int i = 0; i < listAnggota.size(); i++){
                Anggota a = (Anggota) listAnggota.get(i);
                if (!a.getNama().equals(nama) || !a.getEmail().equals(email))
                    g = i;
                else{
                    if (a.getNama().equals(nama))
                        System.out.println("Nama sudah terdaftar");
                    else
                        System.out.println("E-mail sudah terdaftar");
                    g = -1; }
            }
            if (g > -1)
                pendaftaran.daftarAnggotaBaru(nama, alamat, noTelp, email, this.kode);
        }
        System.out.println("Pendaftaran berhasil dilakukan");
        this.listAnggota = pendaftaran.getAnggota();
    }
    
    //untuk melakukan pengadaan buku
    public void tambahBuku(String judul, String pengarang, String penerbit, String kodeBuku, String sinopsis, int tahunTerbit, int jmlBuku){
        listBuku.add(new Buku(judul, pengarang, penerbit, kodeBuku, sinopsis, tahunTerbit, jmlBuku));   }
    
    //untuk mendapatkan obj2 Buku yg ada pada listBuku
    public ArrayList<Buku> getListBuku(){
        return listBuku;    }
    
    //untuk mendapatkan obj2 anggota dari listAnggota
    public ArrayList<Anggota> getListAnggota(){
        return listAnggota; }
    
    //untuk mencari array dari data sebuah buku berdasarkan judul atau penulis buku
    public int cariArrayBukuByJudul(String judulBuku){
        Buku cari;
        int arrBuku = -1;
        for (int i = 0; i < listBuku.size(); i++){
            cari = (Buku) listBuku.get(i); //System.out.println(i);
            if ( (cari.getJudul()).equals(judulBuku) )
                arrBuku = i;
        } return arrBuku;
    }
    
    public void cariBukuByJudul(String judulBuku){
        Buku cari;
        int arrBuku = -1;
        System.out.println("Hasil pencarian buku dengan judul "+judulBuku);
        for (int i = 0; i < listBuku.size(); i++){
            cari = (Buku) listBuku.get(i); //System.out.println(i);
            if ( (cari.getJudul()).equals(judulBuku) ){
                arrBuku = i;
                cari.previewBuku();
            }
        }
    }
    
        public int cariArrayBukuByPenulis(String penulis){
        Buku cari;
        int arrBuku = -1;
        for (int i = 0; i < listBuku.size(); i++){
            cari = (Buku) listBuku.get(i); //System.out.println(i);
            if ( (cari.getPengarang()).equals(penulis) )
                arrBuku = i;
        } return arrBuku;
    }

    public void cariBukuByPenulis(String penulis){
        Buku cari;
        int arrBuku = -1;
        System.out.println("Hasil pencarian buku dengan nama penulis "+penulis);
        for (int i = 0; i < listBuku.size(); i++){
            cari = (Buku) listBuku.get(i); //System.out.println(i);
            if ( (cari.getPengarang()).contains(penulis) ){
                arrBuku = i;
                cari.previewBuku();
            }
        }
    }
        
    //untuk mencari status keberadaan data sebuah buku berdasarkan judul atau penulis buku
    public boolean cariBukuByJudulPenulis(String judulBuku, String penulis){
        int ketemu = cariArrayBukuByJudul(judulBuku);
        int found = cariArrayBukuByPenulis(penulis);
        if (ketemu > -1 || found > -1)
            return true;
        return false;    }
    
    //untuk mencari array dari data sebuah buku berdasarkan kode buku
    public int cariArrayBukuByKode(String kodeBuku){
        Buku cari;
        int arrBuku = -1;
        for (int i = 0; i < listBuku.size(); i++){
            cari = (Buku) listBuku.get(i);
            if ( (cari.getKodeBuku()).equals(kodeBuku) ){
                arrBuku = i;
            }
        }
        return arrBuku;
    }
    
    //untuk mencari keberadaan data sebuah buku berdasarkan kode buku
    public boolean cariBukuByKode(String kodeBuku){
        int ketemu = cariArrayBukuByKode(kodeBuku);
        return ketemu != -1;
    }
    
    public void cariBuku(String judul, String penulis){
        if (judul.equals("") && penulis.equals(""))
            System.out.println("Harap isi salah satu kotak dialog");
        else{
            boolean stat = cariBukuByJudulPenulis(judul, penulis);
            if (stat == false)
                System.out.println("Buku tidak tersedia");
            else{
                if(!judul.equals(""))
                    cariBukuByJudul(judul);
                else
                    cariBukuByPenulis(penulis);
            }
                
        }
    }
    
    //untuk mencari array dari data seorang anggota perpus berdasarkan kode anggota
    public int cariArrayAnggotaByKode(String kodeAnggota){
        Anggota cari;
        int arrAg = -1;
        for (int i = 0; i < listAnggota.size(); i++){
            cari = (Anggota) listAnggota.get(i);
            if ( (cari.getKodeAnggota()).equals(kodeAnggota) ){
                arrAg = i;  }
        }
        return arrAg;
    }
    
    //untuk mencari keberadaan data anggota perpustakaan berdasarkan kode anggota
    public boolean cariAnggotaByKode(String kodeAnggota){
        int ketemu = cariArrayAnggotaByKode(kodeAnggota);
        return ketemu != -1;
    }

    public String PeminjamanBuku(String kodeAnggota, String kodeBuku, String kodePinjam){
        String statement = "";
        int arAgt = cariArrayAnggotaByKode(kodeAnggota);
        int arBk = cariArrayBukuByKode(kodeBuku);
        if (arBk == -1){
            statement = "data buku belum terdaftar";
        } else if (arAgt == -1) {
            statement = "data anggota perpustakaan belum terdaftar, silahkan "+
                    " melakukan pendaftaran terlebih dahulu";
        } else {
            Anggota peminjam = (Anggota) listAnggota.get(arAgt);
            Buku bk = (Buku) listBuku.get(arBk);
            Date tglPinjam = new Date();
            Peminjaman pinjam = new Peminjaman(bk, kodePinjam, tglPinjam);
            peminjam.melakukanPeminjamanBuku(pinjam);
            if (peminjam.cariPeminjaman(kodePinjam) != -1){
                long jmlBukuDulu = bk.getJumlahBuku(); // System.out.println("jmlBukuBefore : "+jmlBukuDulu);
                bk.bukuDipinjam();
                long jmlBukuSekarang = bk.getJumlahBuku(); // System.out.println("jmlBukuAfter : "+jmlBukuSekarang);
                statement = "Dokumentasi peminjaman sudah tersimpan";
            } else
                statement = "Dokumentasi peminjaman gagal disimpan";
        }
        return statement;
    }
    
    public void viewSemuaListAnggota(){
        if (listAnggota.isEmpty()){
            System.out.println("Belum ada anggota perpustakaan yang terdaftar");    }
        for (int i = 0; i < listAnggota.size(); i++){
            Anggota a = (Anggota) listAnggota.get(i);
            a.viewBiodata();
        }
    }
    
    public void viewSemuaListBuku(){
        int no = 0;
        System.out.println("----------- Daftar Buku -----------");
        if (listBuku.isEmpty()){
            System.out.println("Belum ada buku yang terdaftar");    }
        for (int i = 0; i < listBuku.size(); i++){
            Buku bk = (Buku) listBuku.get(i);
            no = no + 1;
            System.out.println(no+". Judul : "+bk.getJudul());
            System.out.println("   Penulis : "+bk.getPengarang());
        }
        System.out.println("-----------------------------------");
    }
    
    public String PengembalianBuku(String kodeAnggota, String kodePeminjaman){
        Date tglBalik = new Date();
        String statement = "Data peminjaman tidak ditemukan";
        boolean cek = false;
        Anggota peminjam;
        int statA = cariArrayAnggotaByKode(kodeAnggota);
        if (statA == -1){
            statement = "Anda salah memasukkan kode anggota";
        } else {
            peminjam = (Anggota) listAnggota.get(statA);
            cek = peminjam.melakukanPengembalian(kodePeminjaman, tglBalik);
            if (cek == true)
                statement = "Dokumentasi pengembalian buku berhasil disimpan";
            else
                statement = "Dokumentasi pengembalian buku gagal disimpan";
        }
        return statement;
    }
    
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
        }
        return cek;
    }
    
//    public String convertDateToString(Date tgl){
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//        return sdf.format(tgl);
//    }
    
}
