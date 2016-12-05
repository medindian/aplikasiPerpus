package Model;

import java.util.ArrayList;
import java.util.Date;

//objek pembuat anggota perharinya
//satu obj pendaftaran untuk 1 hari saja
public class Pendaftaran{
    
    private Anggota anggota;
    private Date tglDaftar;
    
    public void daftarAnggotaBaru(String nama, String alamat, String noTelp, String email, int kode){
        this.anggota = new Anggota(nama, alamat, noTelp, email, kode);
        this.tglDaftar = new Date();
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota; }

    public void setTglDaftar(Date tglDaftar) {
        this.tglDaftar = tglDaftar; }
    
    public Anggota getAnggota() {
        return anggota; }
        
//    public Anggota cariAnggotaByNama(String nama){
//        Anggota a;
//        for (int i = 0; i < anggota.size(); i++){
//            a = (Anggota) anggota.get(i);
//            if (a.getNama().equals(nama))
//                return a;
//        }
//        return null;
//    }
        
    public Date getTglDaftar() { return tglDaftar; }
        
}
