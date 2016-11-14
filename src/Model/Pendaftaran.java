package Model;

import java.util.ArrayList;
import java.util.Date;

public class Pendaftaran{
    
    private ArrayList anggota = new ArrayList<Anggota>(); 
//    private ArrayList daftarAnggota;
//    public void setDaftarAnggota(){
//        this.daftarAnggota = pendaftaran.getAnggota();    }
    private String notifikasi;
    private Date tgl;

//    public Pendaftaran(String notifikasi, Date tgl, int umur, String nama, String alamat, String noTelp, String email, String username, int kode) {
//        anggota.add(new Anggota(nama, alamat, noTelp, email, username, kode));
//        this.notifikasi = notifikasi;
//        this.tgl = tgl;
//        this.umur = umur;
//    }
    
    public void daftarAnggotaBaru(String nama, String alamat, String noTelp, String email, int kode){
        anggota.add(new Anggota(nama, alamat, noTelp, email, kode));
        this.tgl = new Date();
    }

    public ArrayList getAnggota() {
        return anggota; }
    
//    public Anggota cariAnggotaByUsername(String username){
//        Anggota a;
//        for (int i = 0; i < anggota.size(); i++){
//            a = (Anggota) anggota.get(i);
//            if (a.getUsername()).equals(username) )
//                return a;
//        }
//        return null;
//    }
    
    public Anggota cariAnggotaByNama(String nama){
        Anggota a;
        for (int i = 0; i < anggota.size(); i++){
            a = (Anggota) anggota.get(i);
            if (a.getNama().equals(nama))
                return a;
        }
        return null;
    }
        
    public Date getTgl() { return tgl; }
    
    public String getNotifikasi(String username) {         
        return notifikasi;  }
    
}
