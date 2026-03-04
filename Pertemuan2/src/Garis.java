/* Nama File   : Garis.java
 * Deskripsi   : berisi atribut dan method dalam class Garis
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117
 * Tanggal     : 4 Maret 2026
 */

public class Garis {
    Titik tAwal;
    Titik tAkhir;
    static int counterGaris = 0;
    
    Garis(){
        this(new Titik(0, 0), new Titik(1, 1));
    }

    Garis(Titik tAwal, Titik tAkhir){
        this.tAwal = tAwal;
        this.tAkhir = tAkhir;
        counterGaris++;
    }

    Titik getTitikAwal(){
        return tAwal;
    }

    Titik getTitikAkhir(){
        return tAkhir;
    }

    void setTitikAwal(Titik T){
        tAwal = T;
    }

    void setTitikAkhir(Titik T){
        tAkhir = T;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    double panjangGaris(){
        return tAwal.getJarak(tAkhir);
    }

    double gradienGaris(){
        return (tAkhir.getOrdinat()-tAwal.getOrdinat()) / (tAkhir.getAbsis()-tAwal.getAbsis());
    }

    Titik tTengah(){
        return new Titik((tAwal.getAbsis()+tAkhir.getAbsis())/2, (tAwal.getOrdinat()+tAkhir.getOrdinat())/2);
    }

    boolean isSejajar(Garis G){
        return this.gradienGaris() == G.gradienGaris();
    }

    boolean isTegakLurus(Garis G){
        return this.gradienGaris()*G.gradienGaris() == -1;
    }

    void printGaris(){
        System.out.println("Titik Awal: (" + tAwal.getAbsis() + ", " + tAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + tAkhir.getAbsis() + ", " + tAkhir.getOrdinat() + ")");
    }

    String persamaanGaris(){
        double m = gradienGaris();
        double x = tAwal.getAbsis();
        double y = tAwal.getOrdinat();
        double c = y-(m*x);
        return "y = " + m + "x + " + c;
    }

}
