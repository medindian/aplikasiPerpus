package Model;

public class Denda {
    
    private long banyakKeterlambatan = 0;
    private long totalDenda = 0;

    public void setBanyakKeterlambatan(long banyakHari) {
        this.banyakKeterlambatan = banyakHari-7; }
    
    public long getBanyakKeterlambatan(){
        return this.banyakKeterlambatan;    }
    
    public void setTotalDenda(long dendaTerhitung){
        this.totalDenda = dendaTerhitung;    }

    public long getTotalDenda() {
        return this.totalDenda;  }
    
    public long hitungTotalDenda(){
        return banyakKeterlambatan*1000;    }
}
