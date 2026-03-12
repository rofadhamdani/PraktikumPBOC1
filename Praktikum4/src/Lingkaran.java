/* Nama File   : Lingkaran.java
 * Deskripsi   : berisi atribut dan method dalam class Lingkaran
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 12 Maret 2026
 */

public class Lingkaran extends BangunDatar {
    private double jari;

    /*======================= KONSTRUKTOR ======================== */
    // membuat konstruktor default
    public Lingkaran(){
        this.jari = 0.0;
    }

    // membuat konstruktor dengan parameter
    public Lingkaran(double jari, String warna, String border){
        super(1, warna, border);
        this.jari = jari;
    }

    /*======================= SELEKTOR ======================== */
    // mendapatkan nilai jari-jari
    public double getJari(){
        return jari;
    }

    // mendapatkan nilai luas
    public double getLuas(){
        return Math.PI*jari*jari;
    }

    // mendapatkan nilai keliling
    public double getKeliling(){
        return 2*Math.PI*jari;
    }

    /*======================= MUTATOR ======================== */
    // mengubah nilai jari-jari
    public void setJari(double jari){
        this.jari = jari;
    }

    /*======================= METHOD LAIN ======================== */
    @Override
    // menampilkan informasi lingkaran
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}
