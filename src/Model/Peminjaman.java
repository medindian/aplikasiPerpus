package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Peminjaman {
    
    //1 peminjaman = 1 pengembalian = 1 buku
    private String kodePeminjaman;
    private Buku buku;
    private Date tglPeminjaman, batasPinjam = null;
    private Pengembalian pengembalian;

    Peminjaman(Buku bukuYgDipinjam, String kdPeminjam, Date tglPinjam) {
        this.buku = bukuYgDipinjam;
        this.kodePeminjaman = kdPeminjam;// + Integer.toString(n);
        this.tglPeminjaman = tglPinjam;
        this.batasPinjam = hitungBatasPeminjaman();
        this.pengembalian = new Pengembalian();
    }
    
    public Peminjaman(Buku bukuYgDipinjam, String kdPeminjam, Date tglPinjam, Date tglDeadline) {
        this.buku = bukuYgDipinjam;
        this.kodePeminjaman = kdPeminjam;// + Integer.toString(n);
        this.tglPeminjaman = tglPinjam;
        this.batasPinjam = tglDeadline;
        this.pengembalian = new Pengembalian();
    }

    public Buku getBuku() {
        return buku;    }

    public void setBuku(Buku buku) {
        this.buku = buku;    }
        
    public boolean sudahMengembalikanBuku(){
        return pengembalian.getTglPengembalian() != null;
    }
    
    public int banyakHariDalamSebulan(int iYear, int iMonth){
            Calendar mycal = new GregorianCalendar(iYear, iMonth, 1);
            int daysInMonth = mycal.getActualMaximum(Calendar.DAY_OF_MONTH);
            return daysInMonth;
    }
    
    public Date hitungBatasPeminjaman(){
        int hr = this.tglPeminjaman.getDate();
        int bln = this.tglPeminjaman.getMonth(); // 0 - 11
        int thn = this.tglPeminjaman.getYear();
        if (hr >= 25 && banyakHariDalamSebulan(thn, bln) == 30 && bln == 11) {
                hr = (hr+7) - banyakHariDalamSebulan(thn, bln);
                bln += 1;   thn += 1;
        } else
            hr = hr+7;
        Date dd = new Date();
        dd.setDate(hr);     dd.setMonth(bln);   dd.setYear(thn);
        dd.setHours(20);    dd.setMinutes(0);   dd.setSeconds(0);
        return dd;
    }

    public Date getTglPeminjaman() {
        return tglPeminjaman;   }

    public void setTglPeminjaman(Date tglPinjam) {
        this.tglPeminjaman = tglPinjam;
        setBatasPinjam();   }

    public Date getBatasPinjam() {
        return batasPinjam; }
    
    public void setBatasPinjam(){
        this.batasPinjam = hitungBatasPeminjaman();   }
    
    public String convertDateToString(Date tglBaru){
        SimpleDateFormat newFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String newDate = newFormat.format(tglBaru);
        return newDate; }
    
    public void viewTglPinjam(){
        System.out.println("tglPinjam : "+convertDateToString(this.tglPeminjaman));
        System.out.println("batasPinjam : "+convertDateToString(this.batasPinjam));
    }
    
    public String getKodePeminjaman() {
        return kodePeminjaman;  }

    public void setKodePeminjaman(String kodePeminjaman) {
        this.kodePeminjaman = kodePeminjaman;   }

    public Pengembalian getPengembalian() {
        return pengembalian;    }

    public void setPengembalian(Pengembalian pengembalian) {
        this.pengembalian = pengembalian;   }
    
    public void pengembalianBuku(Date tglKembali){
        String pinjam = convertDateToString(this.tglPeminjaman);
        String dd = convertDateToString(this.batasPinjam);
        String kembali = convertDateToString(tglKembali);
        this.pengembalian.melakukanPengembalianBuku(pinjam, dd, tglKembali, kembali);
        boolean checkDenda = this.pengembalian.isBayarDenda(dd, kembali);
        if (checkDenda == true){
            long jmlDenda = this.pengembalian.getDenda().getTotalDenda();
            System.out.println("Anda tidak dapat melakukan perpanjangan buku dan "+
                    "harus membayar denda sebanyak Rp "+jmlDenda);
        } else
            System.out.println("Terima kasih sudah mengembalikan buku tepat waktu!");
    }
    
    public void bayarDenda(long dendaYgDibayar){
        this.pengembalian.pembayaranDenda(dendaYgDibayar);
        if (this.pengembalian.isDendaLunas() == false)
            System.out.println("Anda masih harus membayar hutang sebesar Rp "
                    + this.pengembalian.getDenda().getTotalDenda());
    }
    
    
    
}
