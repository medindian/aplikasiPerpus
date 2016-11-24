package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pengembalian {
    
    private Date tglPengembalian;
    private long banyakHariPinjam;
    private Denda denda;

    public Pengembalian() {
        this.tglPengembalian = null;
        this.banyakHariPinjam = 0;
        this.denda = new Denda();
    }
    
    public Date getTglPengembalian() {
        return tglPengembalian; }
    
    public void setTglPengembalian(Date tglPengembalian) {
        this.tglPengembalian = tglPengembalian; }
    
    public void kalkulatorPenghitungHari(String tglPeminjaman, String tglBalikin){
        //HH converts hour in 24 hours format (0-23), day calculation
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date d1 = null;
	Date d2 = null;

	try {
            d1 = format.parse(tglPeminjaman);
            d2 = format.parse(tglBalikin);
            
            //in milliseconds
            long diff = d2.getTime() - d1.getTime();
            long diffHours = diff / (60 * 60 * 1000) % 24;
            long diffDays = diff / (24 * 60 * 60 * 1000);
            
            if (diffHours > 0){
                diffDays = diffDays+1;  }
            this.banyakHariPinjam = diffDays;
	} catch (Exception e) {
            e.printStackTrace();    }
    }

    public long getBanyakHariPinjam() {
        return this.banyakHariPinjam;    }
    
    public boolean isBayarDenda() {
        if (this.banyakHariPinjam <= 7){
            //System.out.println(this.banyakHariPinjam);
            return false;
        }
        return true;
    }
    
    public Denda getDenda() {
        return denda;   }
    
    public void melakukanPengembalianBuku(String tglPinjamBuku, Date tglKembaliinBuku, String tglBalik){
        setTglPengembalian(tglKembaliinBuku);
        kalkulatorPenghitungHari(tglPinjamBuku, tglBalik);
//        System.out.println("isBayarDenda : "+ isBayarDenda());
        if (isBayarDenda() == true){
            this.denda.setBanyakKeterlambatan(this.banyakHariPinjam);
//            System.out.println("banyak hari terlambat : "+denda.getBanyakKeterlambatan()+" hari");
            long dendaYgHrsDibayar = this.denda.hitungTotalDenda();
            this.denda.setTotalDenda(dendaYgHrsDibayar);
        }
        System.out.println("Denda anda adalah Rp "+denda.getTotalDenda());
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
