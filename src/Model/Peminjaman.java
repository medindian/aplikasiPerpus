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

    Peminjaman(Buku bukuYgDipinjam, String kodePeminjaman, Date tglPinjam) {
        this.buku = bukuYgDipinjam;
        this.kodePeminjaman = kodePeminjaman;
        this.tglPeminjaman = tglPinjam;
        this.batasPinjam = hitungBatasPeminjaman(tglPinjam);
        this.pengembalian = new Pengembalian();
    }
    
    //iMonth : 1 - 12
    public int banyakHariDalamSebulan(int iYear, int iMonth){
            int month = iMonth - 1;
            Calendar mycal = new GregorianCalendar(iYear, month, 1);
            int daysInMonth = mycal.getActualMaximum(Calendar.DAY_OF_MONTH);
            return daysInMonth;
    }
    
    public Date hitungBatasPeminjaman(Date tgl){
            int hr = tgl.getDate();
            int bln = tgl.getMonth(); // 0 - 11
            int thn = tgl.getYear();
            if (hr >= 24){
                if (bln == 11){
                    thn = thn+1;    }
                bln = bln+1;
            }
            hr = (hr+7) - banyakHariDalamSebulan(thn, bln);
            Date dd = new Date();// System.out.println("sementara : "+dd);
            dd.setDate(hr);
            dd.setMonth(bln);
            dd.setYear(thn);
            dd.setHours(20);
            dd.setMinutes(0);
            dd.setSeconds(0);// System.out.println("hasil akhir : " + dd);
            return dd;
    }

    public Date getTglPeminjaman() {
        return tglPeminjaman;   }

    public void setTglPeminjaman(Date tglPinjam) {
        this.tglPeminjaman = tglPinjam;
        setBatasPinjam();
    }

    public Date getBatasPinjam() {
        return batasPinjam; }
    
    public void setBatasPinjam(){
        this.batasPinjam = hitungBatasPeminjaman(this.tglPeminjaman);
    }
    
    public String convertDateToString(Date tglBaru){
        SimpleDateFormat newFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String newDate = "";
        newDate = newFormat.format(tglBaru);
        return newDate; }
    
    public void viewTglPinjam(){
        System.out.println("tglPinjam : "+convertDateToString(this.tglPeminjaman));
        System.out.println("batasPinjam : "+convertDateToString(this.batasPinjam));
    }
    
    public String getKodePeminjaman() {
        return kodePeminjaman;  }

    public void setKodePeminjaman(String kodePeminjaman) {
        this.kodePeminjaman = kodePeminjaman;   }
     
    public void pengembalianBuku(Date tglKembaliinBuku){
        String tglMinjem = convertDateToString(this.tglPeminjaman);
        String tglBalikin = convertDateToString(tglKembaliinBuku);
        this.pengembalian.melakukanPengembalianBuku(tglMinjem, tglKembaliinBuku, tglBalikin);
        
        boolean checkDenda = this.pengembalian.isBayarDenda(); 
        //System.out.println("check denda : "+checkDenda);
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
