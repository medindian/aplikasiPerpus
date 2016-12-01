package Model;

import java.text.*;
import java.util.*;

public class testing {
    
    public static void main(String[] args) throws ParseException {
        
        //anggota
        //String nama, String alamat, String noTelp, String email, int kode
//        Anggota a = new Anggota("dubidam", "ohoho", "081526517", "ahahah", 1);
        
        //pengembalian
//        Buku bk = new Buku("Hello word", "123", "bdg", "BK0101", "one upon a time", 2001, 5);
//        bk.viewInfoBuku();
        //String judul, String pengarang, String penerbit, String kodeBuku, int jmlBuku
//        Buku bkbk = new Buku("Dubidam", "lalala", "us", "BK0213", 3);
//        bkbk.viewInfoBuku();
        
//        Date tgl = new Date();
//        Peminjaman pinjam  = new Peminjaman(bk, "211116", tgl);        
        
        Aplikasi app = new Aplikasi();
        app.tambahAnggota("Hello", "World", "0123124", "ikeren@mail.com");
        app.tambahAnggota("Lala", "Test", "0123124", "yoho@mail.com");
//        app.tambahAnggota("D", "pasir emas", "01388321", "yoho@mail.com");
//        app.viewSemuaListAnggota();
        app.tambahBuku("Hello word", "123", "bdg", "BK0101", "one upon a time", 2001, 5);
        app.tambahBuku("Buku 2", "penulis 2", "bdg", "BK0312", "", 2005, 2);
        app.tambahBuku("Buku 3", "penulis 3", "jkt", "BK0912", "", 2002, 4);
        app.viewSemuaListBuku();
//        System.out.println(app.PeminjamanBuku("MEM0003", "BK0101", "00123"));
        System.out.println(app.PeminjamanBuku("MEM0001", "BK0101", "00123"));
//        System.out.println(app.PeminjamanBuku("MEM0002", "BK0101", "00123"));
//        app.viewSemuaListAnggota();
        Date tgl = new Date();
        tgl.setDate(14);
        tgl.setHours(10);
        
        Anggota a = (Anggota) app.getListAnggota().get(app.cariArrayAnggotaByKode("MEM0001"));
        Peminjaman p = (Peminjaman) a.getListPeminjaman().get(a.cariPeminjaman("00123"));
//        p.viewTglPinjam();
//        System.out.println("Tgl Balik : "+tgl.toString());
//        app.PengembalianBuku("MEM0001", "00123");
//        System.out.println("stat balikin buku : "+app.PengembalianBuku("MEM0001", "00123"));
//        app.BayarDenda("MEM0001", "00123", 10000);
//        System.out.println("stat anggota : "+app.cariAnggotaByKode("MEM0001")); //("MEM0012"));
//        System.out.println("stat array anggota : "+app.cariArrayAnggotaByKode("MEM0002"));
        //kode buku : "BK0312""BK0101""BK0912"
//        System.out.println("stat array buku : "+app.cariArrayBukuByKode("BK10"));
        System.out.println("stat cari buku by judul & penulis : "+app.cariBukuByJudulPenulis("Hello word", "dunno"));
        System.out.println("stat cari buku by kode"+app.cariBukuByKode("BK1231"));
        
//        app.PeminjamanBuku(kodeAnggota, kodeBuku, kodePinjam);
//        Date balik = new Date();
//        balik.setDate(30);
//        balik.setMonth(11);
//        a.melakukanPengembalian("211116", balik);
//        System.out.println("pembayaran ke-1");
//        a.bayarDenda("211116", 10000);
//        System.out.println("pembayaran ke-2");
//        a.bayarDenda("211116", 25000);
        
        //peminjaman
//        Peminjaman pinjam  = new Peminjaman(bk, "211116", tgl);
//        pinjam.viewTglPinjam();
//        Date baru = new Date();    baru.setDate(5);    baru.setMonth(1);
//        baru.setYear(baru.getYear()+1);
//        pinjam.pengembalianBuku(baru);
//        
//        System.out.println("Testing metode dari class peminjaman");        
//        String tglPinjam = pinjam.convertDateToString(pinjam.getTglPeminjaman());
//        String tglDD = pinjam.convertDateToString(pinjam.getBatasPinjam());
//        String tglKembali = pinjam.convertDateToString(baru);
//        System.out.println("bayar denda? "+pinjam.getPengembalian().isBayarDenda(tglDD, tglKembali));
//        System.out.println("sudah lunas? "+pinjam.getPengembalian().isDendaLunas());
//        System.out.println("status denda : "+pinjam.getPengembalian().getDenda().getStatusDenda());
//        pinjam.bayarDenda(70000);
//        System.out.println("denda sudah lunas? "+pinjam.getPengembalian().isDendaLunas());
//        System.out.println("status denda : "+pinjam.getPengembalian().getDenda().getStatusDenda());
        
    }
        
}
//