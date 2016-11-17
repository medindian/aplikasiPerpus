package Model;

import java.util.ArrayList;
import java.util.Date;

public class Peminjaman {
    
    //1 peminjaman = 1 pengembalian = 1 buku
    //private ArrayList pinjamBuku = new ArrayList<Buku>();
    private String kodePeminjaman;
    private Buku pinjamBuku;
    private Date tglPeminjaman, batasPeminjaman;
    private Pengembalian pengembalianBuku;
    private int dendaYgHarusDibayar = 0;
    private int nPeminjaman; //what for?

    public Peminjaman(Buku bukuYgDipinjam, String kodePeminjaman, Date tglPeminjaman, Date batasPeminjaman) {
        this.pinjamBuku = bukuYgDipinjam;
        this.kodePeminjaman = kodePeminjaman;
        this.tglPeminjaman = tglPeminjaman;
        this.batasPeminjaman = batasPeminjaman;
        this.pengembalianBuku = new Pengembalian();
    }

    public String getKodePeminjaman() {
        return kodePeminjaman;  }

    public void setKodePeminjaman(String kodePeminjaman) {
        this.kodePeminjaman = kodePeminjaman;   }

    public Date getTglPeminjaman() {
        return tglPeminjaman;   }

    public void setTglPeminjaman(Date tglPeminjaman) {
        this.tglPeminjaman = tglPeminjaman; }

    public Date getBatasPeminjaman() {
        return batasPeminjaman; }

    public void setBatasPeminjaman(Date batasPeminjaman) {
        this.batasPeminjaman = batasPeminjaman; }
    
//    public void tambahPeminjaman(Buku bukuDipinjam){
//        pinjamBuku.add(bukuDipinjam);   }
    
    public void ubahPeminjaman(Date tglPinjam, Date batasPinjam){
        setTglPeminjaman(tglPinjam);
        setBatasPeminjaman(batasPinjam);
    }
    
    public void pengembalianBuku(Pengembalian pengembalian){
        //this.pengembalianBuku = pengembalian;
//        this.pengembalianBuku.setTglPengembalianBuku(pengembalian.getTglPengembalian());
        boolean checkDenda = this.pengembalianBuku.isBayarDenda(); 
        if (checkDenda == true){
            System.out.println("Anda harus bayar denda dan tidak bisa melakukan perpanjangan buku");
            //
            dendaYgHarusDibayar = this.pengembalianBuku.perhitunganDenda();
        } else
            System.out.println("Anda tidak mendapat denda");
    }
    
    public void bayarDenda(int dendaYgDibayar){
        this.pengembalianBuku.pembayaranDenda(dendaYgDibayar);
        if (this.pengembalianBuku.isDendaLunas() == false)
            System.out.println("Anda masih harus membayar hutang sebesar RPp."
                    + this.pengembalianBuku.getDenda().getTotalDenda());
    }
    
//    public int jumlahPinjamBuku(){
//        int jmlBuku = 0;
//        for (int i=0; i < pinjamBuku.size(); i++){
//            jmlBuku = jmlBuku + 1;
//        }
//        return jmlBuku; }
    
}
