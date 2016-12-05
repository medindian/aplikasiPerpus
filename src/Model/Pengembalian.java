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
    
    public Pengembalian(Date tglBalik, long banyakHari){
        this.tglPengembalian = tglBalik;
        this.banyakHariPinjam = banyakHari;
    }
    
    public Date getTglPengembalian() {
        return tglPengembalian; }
    
    public void setTglPengembalian(Date tglPengembalian) {
        this.tglPengembalian = tglPengembalian; }
    
    public long hitungWaktu(String tgl){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date d1 = null;
        long diff = 0;
//        long diffHours = 0;
//        long diffDays = 0;
	try {
            d1 = format.parse(tgl);
            diff = d1.getTime();            
	} catch (Exception e) {
            e.printStackTrace();    }
        return diff;//diffDays;
    }
    
    public long kalkulatorPenghitungHari(String tgl1, String tgl2){
        //HH converts hour in 24 hours format (0-23), day calculation
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date d1 = null;
	Date d2 = null;
        long diff =0;
        long diffHours = 0;
        long diffDays = 0;
	try {
            d1 = format.parse(tgl1);
            d2 = format.parse(tgl2);
            
            //in milliseconds
            diff = d2.getTime() - d1.getTime();
            diffHours = diff / (60 * 60 * 1000) % 24;
            diffDays = diff / (24 * 60 * 60 * 1000);
            
//            if (diffHours > 0){
//                diffDays = diffDays+1;  }
            //this.banyakHariPinjam = diffDays;
//            System.out.println("this.banyakHariPinjam : "+banyakHariPinjam);
	} catch (Exception e) {
            e.printStackTrace();    }
        return diffDays;
    }

    public void setBanyakHariPinjam(String tglPeminjaman, String tglBalikin) {
        this.banyakHariPinjam = kalkulatorPenghitungHari(tglPeminjaman, tglBalikin);
    }
    
    public long getBanyakHariPinjam() {
        return this.banyakHariPinjam;    }
    
    public boolean isBayarDenda(String deadline, String kembali) {
        long diffDeadline = hitungWaktu(deadline);
        long diffKembali = hitungWaktu(kembali);
        if (diffKembali > diffDeadline){
            denda.setStatusDenda(true);
            return true;
        }
        return false;
    }

    public boolean isDendaLunas(){
        if (denda.getStatusDenda() == false)
            return true;
        return false;
    }
    
    public Denda getDenda() {
        return denda;   }
    
    public void melakukanPengembalianBuku(String tglPinjam, String tglDd, Date tglKembaliinBuku, String tglKembali){
        setTglPengembalian(tglKembaliinBuku);
        setBanyakHariPinjam(tglPinjam, tglKembali);
        if(isBayarDenda(tglDd, tglKembali) == true){
            this.denda.setBanyakKeterlambatan(kalkulatorPenghitungHari(tglDd, tglKembali));
            System.out.println("Banyak hari terlambat : "+denda.getBanyakKeterlambatan()+" hari");
            long dendaYgHrsDibayar = this.denda.hitungTotalDenda();
            this.denda.setTotalDenda(dendaYgHrsDibayar);
        }
//        System.out.println("Denda anda adalah Rp "+denda.getTotalDenda());
    }
    
    public void pembayaranDenda(long bayar){
        long dendaYgHrsDibayar = this.denda.getTotalDenda();    // System.out.println("denda sekarang : "+dendaYgHrsDibayar);
        long kembalian = 0;
        long dendaTerbayar = dendaYgHrsDibayar-bayar;
        denda.setTotalDenda(dendaTerbayar);
        if (dendaTerbayar <= 0){
            kembalian = dendaTerbayar*-1;
            if (kembalian > 0)
                System.out.println("Denda anda lunas dan anda mendapat kembalian Rp "+kembalian);
            else
                System.out.println("Denda anda lunas");
            denda.setStatusDenda(false);
            dendaTerbayar = 0;
        }
//        denda.setTotalDenda(dendaTerbayar);
//        System.out.println("Denda anda sekarang Rp "+denda.getTotalDenda());
    }
    
}
