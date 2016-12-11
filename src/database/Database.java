package database;

import com.mysql.jdbc.Driver;
import java.sql.SQLException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import Model.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    private String url = "jdbc:mysql://localhost:3306/aplikasiperpustakaan";
    private String user = "root";
    private String passUser = "";
    private Statement st = null;
    private Connection con = null;
    private ResultSet rs = null;
    
    public ResultSet getRS(){
        try{
            return rs;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public void connect() {
        try {
            con = DriverManager.getConnection(url, user, passUser);
//            st = con.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public ResultSet getData(String SQLString) {
        try {
            st = con.createStatement();
            rs = st.executeQuery(SQLString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public void query(String SQLString) throws SQLException {
        try {
            st = con.createStatement();
            st.executeUpdate(SQLString);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Pendaftaran> readPendaftaran(){
        ArrayList<Pendaftaran> daftarPendaftaran = new ArrayList();
        String state = "SELECT kodeAnggota, tglDaftar FROM pendaftaran";
        ResultSet ss = getData(state);
        try {
            while (ss.next()) {
                Pendaftaran p = new Pendaftaran();
                Anggota a = cariDataAnggota(rs.getString("kodeAnggota"));
                p.setAnggota(a);
                p.setTglDaftar(rs.getDate("tglDaftar"));
                daftarPendaftaran.add(p);
            }
            System.out.println("data pendaftaran terbaca");
        } catch (SQLException ex) {
            Logger.getLogger(Aplikasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return daftarPendaftaran;
    }
    
    public ArrayList<Anggota> readDataAnggota(){
        ArrayList<Anggota> daftarAnggota = new ArrayList();
        String state = "SELECT kodeAnggota, nama, alamat, noTelp, email FROM anggota";
        ResultSet ss = getData(state);
        try {
            while (ss.next()) {
                Anggota a = new Anggota(rs.getString("nama"), rs.getString("alamat"),
                        rs.getString("noTelp"), rs.getString("email"), rs.getString("kodeAnggota"));
                daftarAnggota.add(a);
            }
            System.out.println("data pelamar terbaca");
        } catch (SQLException ex) {
            Logger.getLogger(Aplikasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return daftarAnggota;
    }
    
    public Anggota cariDataAnggota(String kodeAnggota){
        String state = "SELECT nama, alamat, noTelp, email FROM anggota WHERE kodeAnggota = "+kodeAnggota;
        ResultSet ss = getData(state);
        Anggota a = null;
        try{
            a = new Anggota(rs.getString("nama"), rs.getString("alamat"),
                        rs.getString("noTelp"), rs.getString("email"), rs.getString("kodeAnggota"));
        } catch (SQLException ex) {
            Logger.getLogger(Aplikasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    
    public ArrayList<Buku> readDataBuku(){
        ArrayList<Buku> daftarBuku = new ArrayList();
        String state = "SELECT `kodeBuku`, `judul`, `namaPengarang`, 'penerbit', 'thnTerbit',"
                + " 'sinopsis', 'banyakBuku' FROM `buku`";
        ResultSet ss = getData(state);
        try {
            while (ss.next()) {
                Buku b = new Buku(rs.getString("judul"), rs.getString("namaPengarang"),
                        rs.getString("penerbit"), rs.getString("kodeBuku"), 
                        //rs.getString("sinopsis"), 
                        rs.getInt("thnTerbit"), rs.getInt("jmlBuku") );
                daftarBuku.add(b);
            }
//            System.out.println("data lowongan terbaca");
        } catch (SQLException ex) {
            Logger.getLogger(Aplikasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return daftarBuku;
    }
    
    public int cariArrayBuku(String kodeBuku){
        ArrayList<Buku> b = readDataBuku();
        for (int i=0; i < b.size(); i++){
            Buku bk = b.get(i);
            if (bk.getKodeBuku() == kodeBuku){
                return i;
            }
        }
        return -1;
    }
    
    public ArrayList<Peminjaman> readDataPeminjaman(){
        ArrayList<Peminjaman> daftarPeminjaman = new ArrayList();
        String state = "SELECT `kodePeminjaman`, `tglPeminjaman`, "
                + "`tglBatasPinjam`, 'kodeBuku' FROM `peminjaman`";
        ResultSet ss = getData(state);
        try {
            while (ss.next()) {
                //Buku bukuYgDipinjam, String kdPeminjam, Date tglPinjam, Date tglDeadline
                int ar = cariArrayBuku(rs.getString("kodeBuku"));
                Buku b = readDataBuku().get(ar);
                Peminjaman p = new Peminjaman(b, rs.getString("kodePeminjaman"),
                        rs.getDate("tglPinjam"), rs.getDate("tglDeadline"));
                daftarPeminjaman.add(p);
            }
            System.out.println("data peminjaman terbaca");
        } catch (SQLException ex) {
            Logger.getLogger(Aplikasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return daftarPeminjaman;
    }
    
    public int cariArrayPeminjaman(String kodePeminjaman){
        ArrayList<Peminjaman> pj = readDataPeminjaman();
        for (int i=0; i < pj.size(); i++){
            Peminjaman p = pj.get(i);
            if (p.getKodePeminjaman() == kodePeminjaman){
                return i;
            }
        }
        return -1;
    }
    
    public ArrayList<Pengembalian> readDataPengembalian(){
        ArrayList<Peminjaman> daftarPinjam = readDataPeminjaman();
        ArrayList<Pengembalian> daftarPengembalian = new ArrayList();
        String state = "SELECT `tglPengembalian`, `kodePeminjaman`, "
                + "`banyakHariPinjam` FROM `pengembalian`";
        ResultSet ss = getData(state);
        try {
            while (ss.next()) {
                int arP = cariArrayPeminjaman(rs.getString("kodePeminjaman"));
                //public Pengembalian(Date tglBalik, long banyakHari)
                Pengembalian p = new Pengembalian(rs.getDate("tglPengembalian"),
                        rs.getLong("banyakHariPinjam"));
                daftarPengembalian.add(p);
            }
            System.out.println("data peminjaman terbaca");
        } catch (SQLException ex) {
            Logger.getLogger(Aplikasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return daftarPengembalian;
    }
    
    public int saveAnggota(Anggota a){
        String state = "INSERT INTO anggota VALUES ("
            + "'" + a.getKodeAnggota() + "',"
            + "'" + a.getNama() + "',"
            + "'" + a.getAlamat() + "',"
            + "'" + a.getNoTelp() + "',"
            + "'" + a.getEmail() + "')";
        try {
            query(state);
            return 1;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return -1;
        }
    }
    
    public int saveBuku(Buku b){
        String state = "INSERT INTO buku VALUES ("
            + "'" + b.getKodeBuku() + "',"
            + "'" + b.getJudul() + "',"
            + "'" + b.getPengarang() + "',"
            + "'" + b.getPenerbit() + "',"
            + "'" + b.getThnTerbit() + "',"
//            + "'" + b.getSinopsis() + "',"
            + "'" + b.getJumlahBuku() + "')";
        try {
            query(state);
            return 1;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return -1;
        }
    }
    
    public int savePendaftaran(Pendaftaran p){
//        Anggota a = (Anggota) p.getAnggota().get(ar);
        String state = "INSERT INTO pendaftaran VALUES ("
            + "'" + p.getTglDaftar() + "',"
            + "'" + p.getAnggota().getKodeAnggota()+ "')";
        Anggota a = p.getAnggota();
        try {
            query(state);
            int fin = saveAnggota(a);
            if (fin == 1)
                return 1;
            return -1;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return -1;
        }
    }
    
    public int savePeminjaman(Peminjaman p){
        String state = "INSERT INTO peminjaman VALUES ("
            + "'" + p.getKodePeminjaman() + "',"
            + "'" + p.getTglPeminjaman() + "',"
            + "'" + p.getBatasPinjam() + "',"
            + "'" + p.getBuku().getKodeBuku() + "')";
        try {
            query(state);
            return 1;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return -1;
        }
    }
        
}
