package Model;

import java.text.*;
import java.util.*;

public class testing {
    
    public static void main(String[] args) throws ParseException {
        
        //anggota
        //String nama, String alamat, String noTelp, String email, int kode
        Anggota a = new Anggota("dubidam", "ohoho", "081526517", "ahahah", 1);
        System.out.println("kode anggota : "+ a.getKodeAnggota());
        
        //pengembalian
//        Pengembalian kembali = new Pengembalian();        
//        Denda d = kembali.getDenda();
        Buku bk = new Buku("Hello word", "123", "bdg", "BK0101", "one upon a time", 2001, 5);
        Date tgl = new Date();
        Peminjaman pinjam  = new Peminjaman(bk, "211116", tgl);
        a.melakukanPeminjamanBuku(pinjam);
        System.out.println(a.cariPeminjaman("123"));
        
        
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