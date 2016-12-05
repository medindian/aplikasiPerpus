package Model;

import java.util.Date;

public class Buku {
    
    private String judul, pengarang, penerbit, sinopsis, kodeBuku, thnTerbit;
    private int jumlahBuku;
    
    public Buku(String judul, String pengarang, String penerbit, String kodeBuku, String sinopsis,
            int tahunTerbit, int jmlBuku){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.kodeBuku = kodeBuku;
        this.sinopsis = sinopsis;
        cekTahun(tahunTerbit);
        cekJml(jmlBuku);
        this.jumlahBuku = jmlBuku;
    }

    public String getJudul() {
        return judul;   }

    public void setJudul(String judul) {
        this.judul = judul; }

    public String getPengarang() {
        return pengarang;   }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang; }

    public String getPenerbit() {
        return penerbit;    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;   }

    public String getSinopsis() {
        return sinopsis;    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;   }

    public String getKodeBuku() {
        return kodeBuku;    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;   }

    public String getThnTerbit() {
        return thnTerbit; }

    public void setThnTerbit(String tahunTerbit) {
        this.thnTerbit = tahunTerbit; }

    public int getJumlahBuku() {
        return jumlahBuku;  }

    public void setJumlahBuku(int jumlahBuku) {
        this.jumlahBuku = jumlahBuku;   }
    
    public void bukuDikembalikan(){
        setJumlahBuku( getJumlahBuku() + 1);    }
    
    public void bukuDipinjam(){
        setJumlahBuku( getJumlahBuku() - 1);    }
    
    public void updateInfoBuku(String judul, String pengarang, String penerbit, String sinopsis, String tahunTerbit, int jmlBuku){
        if (!"".equals(judul)){
            setJudul(judul);    }
        if (!"".equals(pengarang)){
            setPengarang(pengarang);    }
        if (!"".equals(penerbit)){
            setPenerbit(penerbit);  }
        if (!"".equals(sinopsis)){
            setSinopsis(sinopsis);  }
        if(!"".equals(tahunTerbit)){
            setThnTerbit(tahunTerbit);  }
        if(jmlBuku != 0){
            setJumlahBuku(jmlBuku); }
    }
    
    public void viewInfoBuku(){
        System.out.println("kode buku : "+getKodeBuku());
        System.out.println("Judul : "+getJudul());
        System.out.println("penulis : "+getPengarang());
        System.out.println("penerbit : "+getPenerbit());
        System.out.println("sinopsis : "+getSinopsis());
        System.out.println("thn terbit : "+getThnTerbit());
        System.out.println("jml buku : "+getJumlahBuku()+" buah");
    }
    
    public String previewBuku(){
        return ("Judul : "+getJudul()+"\n"+
                "penulis : "+getPengarang()+"\n"+
                "sinopsis : "+getSinopsis());
    }
    
    public void cekTahun(int tahun){
        if (cekTahunTerbit(tahun) == true){
            setThnTerbit(String.valueOf(tahun));    }
        else
            System.out.println("anda salah memasukkan tahun terbit");
    }
    
    public boolean cekTahunTerbit(int tahun){
        if (tahun > 0 && tahun <= 2016){
            return true;    }
        return false;
    }
    
    public void cekJml(int jmlBuku){
        if (cekJmlBuku(jmlBuku) == true){
            setJumlahBuku(jmlBuku); }
        else
            System.out.println("Anda salah memasukkan banyak buku");
    }
    
    public boolean cekJmlBuku(int jmlBk){
        if (jmlBk >= 0){
            return true;    }
        return false;
    }
    
    
    
}
