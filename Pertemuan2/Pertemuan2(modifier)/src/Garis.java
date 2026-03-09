/* Nama File   : Garis.java
 * Deskripsi   : berisi atribut dan method dalam class Garis
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 26 Februari 2026
 */

public class Garis {
    /*************** ATRIBUT ***************/
    private Titik tAwal;
    private Titik tAkhir;
    private static int counterGaris = 0;

    /*************** KONSTRUKTOR ***************/
    //konstruktor default untuk membuat garis dari (0,0) ke (1,1)
    public Garis(){
        this(new Titik(0, 0), new Titik(1, 1));
    }

    //konstruktor untuk membuat garis dengan titik awal dan titik akhir tertentu
    public Garis(Titik tAwal, Titik tAkhir){
        this.tAwal = tAwal;
        this.tAkhir = tAkhir;
        counterGaris++;
    }

    /*************** SELEKTOR ***************/
    //mengembalikan titik awal garis
    public Titik getTitikAwal(){
        return tAwal;
    }

    //mengembalikan titik akhir garis
    public Titik getTitikAkhir(){
        return tAkhir;
    }

    //mengembalikan jumlah objek garis yang telah dibuat
    public static int getCounterGaris(){
        return counterGaris;
    }

    /*************** MUTATOR ***************/
    //mengubah titik awal garis
    public void setTitikAwal(Titik T){
        tAwal = T;
    }

    //mengubah titik akhir garis
    public void setTitikAkhir(Titik T){
        tAkhir = T;
    }

    /*************** METHOD LAIN ***************/
    //menghitung panjang garis
    public double panjangGaris(){
        return tAwal.getJarak(tAkhir);
    }

    //menghitung gradien (kemiringan) garis
    public double gradienGaris(){
        return (tAkhir.getOrdinat()-tAwal.getOrdinat()) / (tAkhir.getAbsis()-tAwal.getAbsis());
    }

    //mengembalikan titik tengah dari garis
    public Titik tTengah(){
        return new Titik(
            (tAwal.getAbsis()+tAkhir.getAbsis())/2, (tAwal.getOrdinat()+tAkhir.getOrdinat())/2);
    }

    //mengecek apakah dua garis sejajar
    public boolean isSejajar(Garis G){
        return this.gradienGaris() == G.gradienGaris();
    }

    //mengecek apakah dua garis saling tegak lurus
    public boolean isTegakLurus(Garis G){
        return this.gradienGaris()*G.gradienGaris() == -1;
    }

    //mencetak titik awal dan titik akhir garis
    public void printGaris(){
        System.out.println("Titik Awal: (" + tAwal.getAbsis() + ", " + tAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + tAkhir.getAbsis() + ", " + tAkhir.getOrdinat() + ")");
    }

    //mengembalikan persamaan garis dalam bentuk y = mx + c
    public String persamaanGaris(){
        double m = gradienGaris();
        double x = tAwal.getAbsis();
        double y = tAwal.getOrdinat();
        double c = y-(m*x);
        return "y = " + m + "x + " + c;
    }
}