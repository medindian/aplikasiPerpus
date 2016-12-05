package Model;

import java.util.ArrayList;
import java.util.Date;

public class Anggota {
    
    private String nama, alamat, noTelp, email, kodeAnggota;
//    private int maxPinjam = 2;
    private ArrayList<Peminjaman> listPeminjaman;

    public Anggota(String nama, String alamat, String noTelp, String email, int kode) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
        this.listPeminjaman = new ArrayList<>();
        setKodeAnggota(kode);
    }
    
    public Anggota(String nama, String alamat, String noTelp, String email, String kodeAnggota) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
        this.listPeminjaman = new ArrayList<>();
        this.kodeAnggota = kodeAnggota;
    }
    
    public String getKodeAnggota() {
        return kodeAnggota; }

    public void setKodeAnggota(int kode){
        if (kode < 10){
            this.kodeAnggota = "MEM000"+ Integer.toString(kode);   }
        else if (kode < 100){
            this.kodeAnggota = "MEM00"+ Integer.toString(kode);   }
        else if (kode < 1000){
            this.kodeAnggota = "MEM0"+ Integer.toString(kode);   }
        else 
            this.kodeAnggota = "MEM"+ Integer.toString(kode);
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

    public ArrayList getListPeminjaman() {
        return listPeminjaman;  }

    public void viewBiodata(){
        System.out.println("Kode Anggota       : "+this.kodeAnggota);
        System.out.println("Nama               : "+this.nama);
        System.out.println("Alamat             : "+this.alamat);
        System.out.println("No telp            : "+this.noTelp);
        System.out.println("E-mail             : "+this.email);
        System.out.println("Buku yang dipinjam : "+this.listPeminjaman.size());
    }
    
    public void melakukanPeminjamanBuku(Peminjaman pinjam){
//        if (checkMaxPinjam() == true){
            this.listPeminjaman.add(pinjam);
//            this.maxPinjam = maxPinjam - 1;
//        } else
//            System.out.println("Anda sudah meminjam 2 buku. silahkan lakukan "
//                    + "pengembalian terlebih dahulu");        
//        System.out.println("Dokumentasi peminjaman berhasil disimpan");
    }
    
//    public boolean checkMaxPinjam(){
//        if (this.maxPinjam != 0)
//            return true;
//        return false;    }
    
    public int cariPeminjaman(String kodePeminjaman){
        int arrKetemu = -1;
        for (int i=0; i < listPeminjaman.size(); i++){
            if (listPeminjaman.get(i).getKodePeminjaman().equals(kodePeminjaman)){
                arrKetemu =  i; }
        }
        return arrKetemu;
    }
    
    public boolean melakukanPengembalian(String kodePeminjaman, Date tglKembali){
        int ketemu = cariPeminjaman(kodePeminjaman);
//        String statement = "Error";
        if (ketemu != -1){
            listPeminjaman.get(ketemu).pengembalianBuku(tglKembali);
//            statement = "Dokumentasi pengembalian buku berhasil disimpan";
            return true;
        }
//        System.out.println(statement);
        return false;
    }
    
    public boolean bayarDenda(String kodePeminjaman, long uangDenda){
        int ketemu = cariPeminjaman(kodePeminjaman);
        String statement = "Anda salah memasukkan kode peminjaman";
        if (ketemu != -1){
            listPeminjaman.get(ketemu).bayarDenda(uangDenda);
            long dendaSekarang = listPeminjaman.get(ketemu).getPengembalian().getDenda().getTotalDenda();
            if (listPeminjaman.get(ketemu).getPengembalian().isDendaLunas() == true){    
                statement = "Denda anda sudah lunas";
                return true;
            } 
//            else {
//                statement = "Anda masih memiliki denda sebanyak Rp "+dendaSekarang ;    }
            statement = "Dokumentasi pembayaran denda berhasil disimpan";
        }
        System.out.println(statement);
        return false;
    }
    
}
