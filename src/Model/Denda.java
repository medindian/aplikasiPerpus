package Model;

public class Denda {
    
    private int banyakKeterlambatan;
    private int totalDenda = 0;

    public Denda(int banyakKeterlambatan) {
        this.banyakKeterlambatan = banyakKeterlambatan; }
    
    public int hitungDenda(){ //setDenda
        return banyakKeterlambatan * 1000;    }

    public void setTotalDenda(int totalDenda) {
        this.totalDenda = totalDenda;   }

    public int getTotalDenda() {
        return totalDenda;  }
       
}
