package Model;

import java.util.ArrayList;
import java.util.Date;

public class Peminjaman {
    
    //1 peminjaman = 1 pengembalian = 1 buku
    private String kodePeminjaman;
    private Buku pinjamBuku;
    private String tglPeminjaman, batasPinjam;
    private Pengembalian pengembalianBuku;

    public Peminjaman(Buku bukuYgDipinjam, String kodePeminjaman, String tglPeminjaman, String batasPeminjaman) {
        this.pinjamBuku = bukuYgDipinjam;
        this.kodePeminjaman = kodePeminjaman;
        this.tglPeminjaman = tglPeminjaman;
        this.batasPinjam = batasPeminjaman;
        this.pengembalianBuku = new Pengembalian();
    }
    
    public String getKodePeminjaman() {
        return kodePeminjaman;  }

    public void setKodePeminjaman(String kodePeminjaman) {
        this.kodePeminjaman = kodePeminjaman;   }

    public String getTglPeminjaman() {
        return tglPeminjaman;   }

    public void setTglPeminjaman(String tglPeminjaman) {
        this.tglPeminjaman = tglPeminjaman; }

    //batasPeminjaman = 7 hari setelah tglPinjam
    public String getBatasPinjam() {
        return batasPinjam; }

    public void setBatasPinjam(String batasPeminjaman) {
        this.batasPinjam = batasPeminjaman; }
    
    public void ubahPeminjaman(String tglPinjam, String batasPinjam){
        setTglPeminjaman(tglPinjam);
        setBatasPinjam(batasPinjam);
    }
    
    public void pengembalianBuku(String tglKembaliinBuku){
        this.pengembalianBuku.melakukanPengembalianBuku(getTglPeminjaman(), tglKembaliinBuku);
        boolean checkDenda = this.pengembalianBuku.isBayarDenda(); 
        if (checkDenda == true){
            long jmlDenda = this.pengembalianBuku.getDenda().getTotalDenda();
            System.out.println("Anda tidak dapat melakukan perpanjangan buku dan "+
                    "harus membayar denda sebanyak Rp "+jmlDenda);
        } else
            System.out.println("Terima kasih sudah mengembalikan buku tepat waktu!");
    }
    
    public void bayarDenda(int dendaYgDibayar){
        this.pengembalianBuku.pembayaranDenda(dendaYgDibayar);
        if (this.pengembalianBuku.isDendaLunas() == false)
            System.out.println("Anda masih harus membayar hutang sebesar Rp "
                    + this.pengembalianBuku.getDenda().getTotalDenda());
    }
        
}
