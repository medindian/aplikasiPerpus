package Model;

import java.util.ArrayList;
import java.util.Date;

public class Anggota {
    
    private String nama, alamat, noTelp, email, kodeAnggota;
    private ArrayList<Peminjaman> listPeminjaman;

    //public Anggota(String nama, String alamat, String noTelp, String email, String username, int kode) {
    public Anggota(String nama, String alamat, String noTelp, String email, int kode) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
        this.listPeminjaman = new ArrayList<>();
    //    this.username = username;
        if (kode < 10){
            this.kodeAnggota = "MEMBER-000"+ Integer.toString(kode);   }
        else if (kode < 100){
            this.kodeAnggota = "MEMBER-00"+ Integer.toString(kode);   }
        else if (kode < 1000){
            this.kodeAnggota = "MEMBER-0"+ Integer.toString(kode);   }
        else 
            this.kodeAnggota = "MEMBER-00"+ Integer.toString(kode);
    }

    public String getNama() {
        return nama;    }

    public void setNama(String nama) {
        this.nama = nama;   }

    public String getAlamat() {
        return alamat;  }

    public void setAlamat(String alamat) {
        this.alamat = alamat;   }

    public String getNoTelp() {
        return noTelp;  }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;   }

    public String getEmail() {
        return email;   }

    public void setEmail(String email) {
        this.email = email; }

    public String getKodeAnggota() {
        return kodeAnggota; }

    public ArrayList getListPeminjaman() {
        return listPeminjaman;  }

    
    public void melakukanPeminjamanBuku(Buku bukuYgDipinjam, String kodePeminjaman, Date tglPeminjaman, Date batasPeminjaman){
//        Peminjaman kegPinjam = new Peminjaman(bukuYgDipinjam, kodePeminjaman, tglPeminjaman, batasPeminjaman);
//        this.listPeminjaman.add(kegPinjam);
        System.out.println("Dokumentasi Peminjaman berhasil disimpan");
    }
    
    public int cariPeminjamanBuku(String kodePeminjaman){
        int arrKetemu = -1;
        for (int i=0; i < listPeminjaman.size(); i++){
            if (listPeminjaman.get(i).getKodePeminjaman() == kodePeminjaman){
                arrKetemu =  i; }
        }
        return arrKetemu;
    }
    
    public boolean melakukanPengembalian(String kodePeminjaman, String tglKembali){
        int peminjamanKetemu = cariPeminjamanBuku(kodePeminjaman);
        boolean stat = false;
        //String statement = "Error";
        if (peminjamanKetemu != -1){
//            listPeminjaman.get(peminjamanKetemu).pengembalianBuku(kegPengembalian);
            stat = true;
            //statement = "Dokumentasi pengembalian buku berhasil disimpan";
        }
        return stat;
    }
    
}
