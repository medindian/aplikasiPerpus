package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pengembalian {
    
    private String tglPengembalian;
    private long banyakHariPinjam;
    private Denda denda;

    public Pengembalian() {
        this.tglPengembalian = "belum mengembalikan buku";
        this.banyakHariPinjam = 0;
        this.denda = new Denda();
    }
    
    public String getTglPengembalian() {
        return tglPengembalian; }
    
    public void setTglPengembalian(String tglPengembalian) {
        this.tglPengembalian = tglPengembalian; }
    
    public void kalkulatorPenghitungHari(String tglPeminjaman){
        //HH converts hour in 24 hours format (0-23), day calculation
	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	Date d1 = null;
	Date d2 = null;

	try {
            d1 = format.parse(tglPeminjaman);
            d2 = format.parse(this.tglPengembalian);
//            System.out.println("d1 = "+d1);
//            System.out.println("d2 = "+d2);
            
            //in milliseconds
            long diff = d2.getTime() - d1.getTime();
            long diffHours = diff / (60 * 60 * 1000) % 24;
            long diffDays = diff / (24 * 60 * 60 * 1000);
            
//            System.out.println(diffDays + " days");
            if (diffHours > 0){
                diffDays = diffDays+1;  }
//            System.out.print(diffDays + " days, ");
//            System.out.println(diffHours + " hours");

            this.banyakHariPinjam = diffDays;
	} catch (Exception e) {
            e.printStackTrace();    }
    }

    public long getBanyakHariPinjam() {
        return this.banyakHariPinjam;    }
    
    public boolean isBayarDenda() {
        if (this.banyakHariPinjam <= 7){
            System.out.println(this.banyakHariPinjam);
            return false;
        }
        return true;
    }
    
    public Denda getDenda() {
        return denda;   }
    
    //karena pembuatan objek pengembalian dilakukan oleh objek peminjaman, 
        //maka dilakukan setting tgl pengembalian
    public void melakukanPengembalianBuku(String tglPinjamBuku, String tglKembaliinBuku){
        setTglPengembalian(tglKembaliinBuku);
        kalkulatorPenghitungHari(tglPinjamBuku);
        if (isBayarDenda() == true){
            this.denda.setBanyakKeterlambatan(this.banyakHariPinjam);
//            System.out.println("banyak hari terlambat : "+denda.getBanyakKeterlambatan()+" hari");
            long dendaYgHrsDibayar = this.denda.hitungTotalDenda();
            this.denda.setTotalDenda(dendaYgHrsDibayar);
//            System.out.println("Anda harus membayar denda sebesar Rp"+denda.getTotalDenda());
        }
    }
    
    public void pembayaranDenda(long bayar){
        long dendaYgHrsDibayar = this.denda.hitungTotalDenda();
        long kembalian = 0;
        long dendaDibayar = dendaYgHrsDibayar-bayar;
        if (dendaDibayar < 0){
            kembalian = dendaDibayar*-1;
//            System.out.println("denda lunas dan anda mendapat kembalian Rp "+kembalian);
            dendaDibayar = 0;
        }
        denda.setTotalDenda(dendaDibayar);
//        System.out.println("denda anda sekarang Rp "+denda.getTotalDenda());
    }
    
    public boolean isDendaLunas(){
        if (denda.getTotalDenda() == 0)
            return true;
        return false;
    }
    
}
