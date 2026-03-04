/* Nama File   : Garis.java
 * Deskripsi   : berisi atribut dan method dalam class Garis
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117
 * Tanggal     : 4 Maret 2026
 */

public class Garis {
    private Titik tAwal;
    private Titik tAkhir;
    private static int counterGaris = 0;
    
    public Garis(){
        this(new Titik(0, 0), new Titik(1, 1));
    }

    public Garis(Titik tAwal, Titik tAkhir){
        this.tAwal = tAwal;
        this.tAkhir = tAkhir;
        counterGaris++;
    }

    public Titik getTitikAwal(){
        return tAwal;
    }

    public Titik getTitikAkhir(){
        return tAkhir;
    }

    public void setTitikAwal(Titik T){
        tAwal = T;
    }

    public void setTitikAkhir(Titik T){
        tAkhir = T;
    }

    public static int getCounterGaris(){
        return counterGaris;
    }

    public double panjangGaris(){
        return tAwal.getJarak(tAkhir);
    }

    public double gradienGaris(){
        return (tAkhir.getOrdinat()-tAwal.getOrdinat()) / (tAkhir.getAbsis()-tAwal.getAbsis());
    }

    public Titik tTengah(){
        return new Titik((tAwal.getAbsis()+tAkhir.getAbsis())/2, (tAwal.getOrdinat()+tAkhir.getOrdinat())/2);
    }

    public boolean isSejajar(Garis G){
        return this.gradienGaris() == G.gradienGaris();
    }

    public boolean isTegakLurus(Garis G){
        return this.gradienGaris()*G.gradienGaris() == -1;
    }

    public void printGaris(){
        System.out.println("Titik Awal: (" + tAwal.getAbsis() + ", " + tAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + tAkhir.getAbsis() + ", " + tAkhir.getOrdinat() + ")");
    }

    public String persamaanGaris(){
        double m = gradienGaris();
        double x = tAwal.getAbsis();
        double y = tAwal.getOrdinat();
        double c = y-(m*x);
        return "y = " + m + "x + " + c;
    }

}
