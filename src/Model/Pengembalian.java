package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pengembalian {
    
    private String tglPengembalian;
    private long banyakHariPinjam = 0;
    private Denda denda;
    
    public String getTglPengembalian() {
        return tglPengembalian; }
    
    public void setTglPengembalian(Date tglPengembalian) {
        this.tglPengembalian = tglPengembalian.toString(); }
    
    public void kalkulatorPenghitungHari(String tglPeminjaman){
        //HH converts hour in 24 hours format (0-23), day calculation
	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	Date d1 = null;
	Date d2 = null;

	try {
            d1 = format.parse(tglPeminjaman);
            d2 = format.parse(this.tglPengembalian);
            //untuk testing
//            System.out.println("d1 = "+d1);
//            System.out.println("d2 = "+d2);
            
            //in milliseconds
            long diff = d2.getTime() - d1.getTime();
            long diffHours = diff / (60 * 60 * 1000) % 24;
            long diffDays = diff / (24 * 60 * 60 * 1000);
            
            if (diffHours > 0){
                diffDays = diffDays+1;  }
            //testing
//            System.out.print(diffDays + " days, ");
//            System.out.print(diffHours + " hours, ");

            this.banyakHariPinjam = diffDays;
	} catch (Exception e) {
            e.printStackTrace();    }
    }

    public long getBanyakHariPinjam() {
        return this.banyakHariPinjam;    }
    
    public boolean isBayarDenda() {
        if (this.banyakHariPinjam <= 7){
            return true;
        }
        return false;
    }
    
    public Denda getDenda() {
        return denda;   }
    
    //karena pembuatan objek pengembalian dilakukan oleh objek peminjaman, 
        //maka dilakukan setting tgl pengembalian
    public void melakukanPengembalianBuku(String tglPinjamBuku, Date tglKembaliinBuku){
        setTglPengembalian(tglKembaliinBuku);
        kalkulatorPenghitungHari(tglPinjamBuku);
        this.denda = new Denda();
        if (isBayarDenda() == true){
            this.denda.setBanyakKeterlambatan(this.banyakHariPinjam);
            long dendaYgHrsDibayar = this.denda.hitungTotalDenda();
            this.denda.setTotalDenda(dendaYgHrsDibayar);
        }
    }
    
    public void pembayaranDenda(long bayar){
        long dendaYgHrsDibayar = this.denda.hitungTotalDenda();
        denda.setTotalDenda(dendaYgHrsDibayar-bayar);
    }
    
    public boolean isDendaLunas(){
        if (denda.getTotalDenda() == 0)
            return true;
        return false;
    }
    
}
