package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Peminjaman {
    
    //1 peminjaman = 1 pengembalian = 1 buku
    private String kodePeminjaman;
    private Buku buku;
    private String tglPeminjaman, batasPinjam;
//    private Date tglPinjam, deadlinePinjam;
    private Pengembalian pengembalian;

    Peminjaman(Buku bukuYgDipinjam, String kodePeminjaman, Date tglPeminjaman, String batasPeminjaman) {
        this.buku = bukuYgDipinjam;
        this.kodePeminjaman = kodePeminjaman;
        this.tglPeminjaman = convertDateToString(tglPeminjaman);
        this.batasPinjam = batasPeminjaman;
        this.pengembalian = new Pengembalian();
    }
    
    public String convertDateToString(Date tglBaru){
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String tgl = tglBaru.toString();
        Date d = null;
        try {
            d = format.parse(tgl);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return d.toString();
    }
    
   public Date hitungBatasPeminjaman(Date tglPinjam){
       tglPinjam.getDay();
       tglPinjam.getMonth();
       tglPinjam.getYear();
       return tglPinjam;
   }
    
    public String getKodePeminjaman() {
        return kodePeminjaman;  }

    public void setKodePeminjaman(String kodePeminjaman) {
        this.kodePeminjaman = kodePeminjaman;   }

    public String getTglPeminjaman() {
        return tglPeminjaman;   }

    public void setTglPeminjaman(Date tglPeminjaman) {
        this.tglPeminjaman = convertDateToString(tglPeminjaman); }

    //batasPeminjaman = 7 hari setelah tglPinjam
    public String getBatasPinjam() {
        return batasPinjam; }

    public void setBatasPinjam(Date batasPinjam) {
        this.batasPinjam = convertDateToString(batasPinjam); }

//    public Date getTglPinjam() {
//        return tglPinjam;
//    }
//
//    public void setTglPinjam(Date tglPinjam) {
//        this.tglPinjam = tglPinjam;
//    }
//
//    public Date getDeadlinePinjam() {
//        return deadlinePinjam;
//    }
//
//    public void setDeadlinePinjam(Date deadlinePinjam) {
//        this.deadlinePinjam = deadlinePinjam;
//    }
     
    public void ubahPeminjaman(Date tglPinjam, Date batasPinjam){
        setTglPeminjaman(tglPinjam);
        setBatasPinjam(batasPinjam);    }
    
    public void pengembalianBuku(String tglKembaliinBuku){
//        this.pengembalian.melakukanPengembalianBuku(getTglPeminjaman(), tglKembaliinBuku);
        boolean checkDenda = this.pengembalian.isBayarDenda(); 
        if (checkDenda == true){
            long jmlDenda = this.pengembalian.getDenda().getTotalDenda();
            System.out.println("Anda tidak dapat melakukan perpanjangan buku dan "+
                    "harus membayar denda sebanyak Rp "+jmlDenda);
        } else
            System.out.println("Terima kasih sudah mengembalikan buku tepat waktu!");
    }
    
    public void bayarDenda(int dendaYgDibayar){
        this.pengembalian.pembayaranDenda(dendaYgDibayar);
        if (this.pengembalian.isDendaLunas() == false)
            System.out.println("Anda masih harus membayar hutang sebesar Rp "
                    + this.pengembalian.getDenda().getTotalDenda());
    }
        
}
