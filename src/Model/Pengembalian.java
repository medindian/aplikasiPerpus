package Model;

import java.util.Date;

public class Pengembalian {
    
    private Date tglPengembalian;
    private int banyakHariPinjam = 0;
    private Denda denda;

//    public Pengembalian(Date tglPengembalian) {
//        this.tglPengembalian = tglPengembalian; }

    public Date getTglPengembalian() {
        return tglPengembalian; }

    public Denda getDenda() {
        return denda;   }
    
    public void setTglPengembalianBuku(Date tglPengembalian){
        this.tglPengembalian = tglPengembalian; }
    
    public void kalkulatorPenghitungHari(Date tglPeminjaman, Date tglPengembalian){
        int banyakHari = 0;
        //hitung banyaknya hari peminjam meminjam buku
        this.banyakHariPinjam = banyakHari;
    }

    public int getBanyakHariPinjam() {
        return banyakHariPinjam;    }

    public boolean isBayarDenda() {
        if (banyakHariPinjam <= 7){
            return true;
        }
        return false;
    }
    
    public int perhitunganDenda(){
        this.denda = new Denda(getBanyakHariPinjam()-7);
        denda.setTotalDenda(denda.hitungDenda());
        return denda.getTotalDenda();
    }
    
    public boolean pembayaranDenda(int bayar){
        denda.setTotalDenda(denda.getTotalDenda()-bayar);
        //boolean stat = false;
        if (denda.getTotalDenda() == 0)
            return true;
            //System.out.println("Denda sudah lunas");
            //stat = true;
        //else System.out.println("Denda belum lunas");
        return false;
    }
    
    public boolean isDendaLunas(){
        if (denda.getTotalDenda() == 0)
            return true;
        return false;
    }
    
}
