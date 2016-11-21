package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testing {
    
    public static void main(String[] args) throws ParseException {
    
        //testing denda
//        Denda d = new Denda();
//        System.out.println("Old : ");
//        System.out.println(d.getBanyakKeterlambatan());
//        System.out.println(d.getTotalDenda());
//        System.out.println(d.hitungTotalDenda());
//        
//        d.setBanyakKeterlambatan(10);
//        d.setTotalDenda(d.hitungTotalDenda());
//        System.out.println("Update : ");
//        System.out.println(d.getBanyakKeterlambatan());
//        System.out.println(d.getTotalDenda());
//        System.out.println(d.hitungTotalDenda());
        
        //testing pengembalian
        Pengembalian kembali = new Pengembalian();
//        System.out.println(kembali.getBanyakHariPinjam());
//        System.out.println(kembali.getTglPengembalian());
        
        Denda d = kembali.getDenda();
//        System.out.println(d.getBanyakKeterlambatan());
//        System.out.println(d.getTotalDenda());
//        System.out.println(d.hitungTotalDenda());
        
        Date tgl = new Date();
//        System.out.println("before : "+tgl.toString());
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//        System.out.println(sdf.format(tgl));
//        kembali.setTglPengembalian(sdf.format(tgl));
//        System.out.println(kembali.getTglPengembalian());
//        kembali.kalkulatorPenghitungHari("01/14/2012 09:29:58");
//        System.out.println(kembali.getBanyakHariPinjam()+" hari");
//        kembali.melakukanPengembalianBuku("01/14/2012 09:29:58", sdf.format(tgl));
//        System.out.println("anda melakukan peminjaman buku sebanyak : "+kembali.getBanyakHariPinjam()+" hari");
//        System.out.println(kembali.isBayarDenda());
//        System.out.println("terlambat mengembalikan sebanyak "+ kembali.getDenda().getBanyakKeterlambatan()+ "hari");
//        System.out.println("denda yg harus dibayar "+kembali.getDenda().getTotalDenda());
//        System.out.println("denda lunas? "+kembali.isDendaLunas());
//        kembali.pembayaranDenda(2000000);
//        System.out.println("denda yg harus dibayar "+kembali.getDenda().getTotalDenda());
//        System.out.println("denda lunas? "+kembali.isDendaLunas());        

        //testing buku
        //judul, String pengarang, String penerbit, String kodeBuku, String sinopsis, Date tahunTerbit, int jmlBuku
        Buku bk = new Buku("Hello word", "123", "bdg", "BK0101", "one upon a time", 2001, 5);
//        System.out.println("Data buku lama");
//        bk.viewInfoBuku();
//        System.out.println("");
        //String judul, String pengarang, String penerbit, String kodeBuku, int jmlBuku
//        bk = new Buku("Another world", "hohoho", "jkt48", "BK0121", 10);
//        System.out.println("Data buku baru");
//        bk.viewInfoBuku();
//        System.out.println("");

        //peminjaman
//        Peminjaman pinjam  = new Peminjaman(bk, "211116", tgl.toString(), "0");
        
        System.out.println("before : " + tgl.toString());
        //tgl.setDate(tgl.getDate()+7);
        tgl.setDate(24);
        //System.out.println("after : " + tgl.toString());
        if (tgl.getDate() >= 24 && tgl.getMonth() == 11){
            int dt = (tgl.getDate()+7) - 30;
            System.out.println("tgl : "+dt);
            int bln = tgl.getMonth() + 1;
            System.out.println("bulan : "+bln);
            tgl.setDate(dt);
            tgl.setMonth(bln);
        } 
        if (tgl.getDate() >= 24){
            int dt = (tgl.getDate()+7) - 30;
            System.out.println("tgl : "+dt);
            int bln = tgl.getMonth() + 1;
            System.out.println("bulan : "+bln);
            tgl.setDate(dt);
            tgl.setMonth(bln);
        } //else if (tgl.getMonth() == 12)
        System.out.println("after : " + tgl.toString());

    }
}
//