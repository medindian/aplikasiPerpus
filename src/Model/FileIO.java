package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileIO {
    public Object loadObject(String filename){
        Object o = new Object();
        try (ObjectInputStream a = new ObjectInputStream(new FileInputStream(filename))){
            o = a.readObject();
        } catch (Exception e) {
            System.out.println(e);
        }
        return o;
    }
    
    public void saveObject(Object o, String filename){
        try (FileOutputStream a = new FileOutputStream(filename)){
            ObjectOutputStream oo = new ObjectOutputStream(a);
            oo.writeObject(o);
            oo.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
//        public void loadAnggota(){
//        this.listAnggota = (ArrayList<Anggota>) database.loadObject("Anggota.txt");    }
//    
//    public void saveAnggota(){
//        database.saveObject(this.listAnggota, "Anggota.txt");    }
//    
//    public void loadBuku(){
//        this.listBuku = (ArrayList<Buku>) database.loadObject("Buku.txt");    }
//    
//    public void saveBuku(){
//        database.saveObject(this.listBuku, "Buku.txt");    }
//    
//    public void loadPendaftaran(){
//        this.listPendaftaran = (ArrayList<Pendaftaran>) database.loadObject("Pendaftaran.txt");    }
//    
//    public void savePendaftaran(){
//        database.saveObject(this.listPendaftaran, "Pendaftaran.txt");    }

}
