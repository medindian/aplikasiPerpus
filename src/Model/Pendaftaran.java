package Model;

import java.util.ArrayList;
import java.util.Date;

//objek pembuat anggota perharinya
//satu obj pendaftaran untuk 1 hari saja
public class Pendaftaran{
    
    private ArrayList anggota = new ArrayList<Anggota>();
    private String tglDaftar;
    
    public void daftarAnggotaBaru(String nama, String alamat, String noTelp, String email, int kode){
        anggota.add(new Anggota(nama, alamat, noTelp, email, kode));
        this.tglDaftar = new Date().toString();
    }

    public ArrayList getAnggota() {
        return anggota; }
        
    public Anggota cariAnggotaByNama(String nama){
        Anggota a;
        for (int i = 0; i < anggota.size(); i++){
            a = (Anggota) anggota.get(i);
            if (a.getNama().equals(nama))
                return a;
        }
        return null;
    }
        
    public String getTglDaftar() { return tglDaftar; }
        
}
