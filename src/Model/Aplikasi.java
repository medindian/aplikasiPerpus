package Model;

import java.util.ArrayList;
import java.util.Date;

public class Aplikasi {
    
    private Pendaftaran pendaftaran;// = new Pendaftaran();
    private static int kode = 0;
    private ArrayList listBuku;
    private ArrayList listAnggota;

    public Aplikasi() {
        this.pendaftaran = new Pendaftaran();
        this.listAnggota = pendaftaran.getAnggota();
        this.listBuku = new ArrayList<Buku>();
    }
    
    //untuk melakukan pendaftaran anggota baru
    public void tambahAnggota(String nama, String alamat, String noTelp, String email){
        this.kode = kode+1;
        pendaftaran.daftarAnggotaBaru(nama, alamat, noTelp, email, this.kode);
        this.listAnggota = pendaftaran.getAnggota();
    }
    
    //untuk melakukan pengadaan buku
    public void tambahBuku(String judul, String pengarang, String penerbit, String kodeBuku, String sinopsis, Date tahunTerbit, int jmlBuku){
        listBuku.add(new Buku(judul, pengarang, penerbit, kodeBuku, sinopsis, tahunTerbit, jmlBuku));   }
    
    //untuk mendapatkan obj2 Buku yg ada pada listBuku
    public ArrayList<Buku> getListBuku(){
        return listBuku;    }
    
    //untuk mendapatkan obj2 anggota dari listAnggota
    public ArrayList<Anggota> getListAnggota(){
        return listAnggota; }
    
    //untuk mencari array dari data sebuah buku berdasarkan judul atau penulis buku
    public int cariArrayBukuByJudulPenulis(String judulBuku, String penulis){
        Buku cari;
        int arrBuku = -1;
        for (int i = 0; i < listBuku.size(); i++){
            cari = (Buku) listBuku.get(i);
            if ( (cari.getJudul()).equals(judulBuku) || (cari.getPengarang()).equals(penulis) ){
                arrBuku = i;    }
        }
        return arrBuku;
    }
    
    //untuk mencari status keberadaan data sebuah buku berdasarkan judul atau penulis buku
    public boolean cariBukuByJudulPenulis(String judulBuku, String penulis){
        int ketemu = cariArrayBukuByJudulPenulis(judulBuku, penulis);
        return ketemu != -1;
    }
    
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
    
    //untuk mencari array dari data seorang anggota perpus berdasarkan nama org tersebut
    public int cariArrayAnggotaByNama(String nama){
        Anggota cari;
        int arrAg = -1;
        for (int i = 0; i < listAnggota.size(); i++){
            cari = (Anggota) listAnggota.get(i);
            if ( (cari.getNama()).equals(nama) ){
                arrAg = i;  }
        }
        return arrAg;
    }
    
    //untuk mencari keberadaan data seorang anggota perpus berdasarkan nama org tersebut
    public boolean cariAnggotaByNama(String nama){
        int ketemu = cariArrayAnggotaByNama(nama);
        return ketemu != -1; //(?)
    }
    
    //untuk melakukan peminjaman buku yang dilakukan oleh anggota perpus
    public String PeminjamanBuku(String kodeAnggota, String kodeBuku, String kodePinjam, Date tglPinjam, Date batasPinjam){
        String statement = "ini statement";
        Anggota peminjam ;
        Buku cariBk ;
        boolean statAnggota = cariAnggotaByKode(kodeAnggota);
        boolean statBuku = cariBukuByKode(kodeBuku);
        if (statBuku == false) {
            statement = "Data buku tidak ada, silahkan simpan data buku terlebih dahulu";
        } else if (statAnggota == false){
            statement = "Anda belum terdaftar atau salah memasukkan kode anggota";
        } else {
            peminjam = (Anggota) listAnggota.get(cariArrayAnggotaByKode(kodeAnggota));
            cariBk = (Buku) listBuku.get(cariArrayBukuByKode(kodeBuku));
            peminjam.melakukanPeminjamanBuku(cariBk, kodePinjam, tglPinjam, batasPinjam);
            statement = "Peminjaman berhasil dilakukan";
        }
        return statement;
    }
    
    public String PengembalianBuku(String kodeAnggota, String kodePeminjaman, Date tglKembaliinBuku){
        String statement = "Error";
        Anggota peminjam;
        Pengembalian kegKembaliinBuku = new Pengembalian();
        kegKembaliinBuku.setTglPengembalianBuku(tglKembaliinBuku);
        //Buku cariBk;
        boolean statAnggota = cariAnggotaByKode(kodeAnggota);
        //boolean statBuku = cariBukuByKode(kodeBuku);
        if (statAnggota == false){
            statement = "Anda belum terdaftar atau salah memasukkan kode anggota";
        } else {
            peminjam = (Anggota) listAnggota.get(cariArrayAnggotaByKode(kodeAnggota));
            boolean status = peminjam.melakukanPengembalian(kodePeminjaman, kegKembaliinBuku);
            //cariBk = (Buku) listBuku.get(cariArrayBukuByKode(kodeBuku));
            //peminjam.melakukanPeminjamanBuku(cariBk);
            if (status == false)
                statement = "Data peminjaman tidak ada";
            else
                statement = "Data pengembalian buku berhasil dilakukan";
        }
        return statement;
    }
    
//        for (int i=0; i < listAnggota.size(); i++){
//            cariAg = (Anggota) listAnggota.get(i);
//            if (cariAg.getKodeAnggota() == kodeAnggota){
//                for (int j = 0; j < listBuku.size(); j++){
//                    
//                }
//            }
//        }
//    }
    
}
