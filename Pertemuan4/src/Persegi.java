/* Nama File   : Persegi.java
 * Deskripsi   : berisi atribut dan method dalam class Persegi
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 12 Maret 2026
 */

public class Persegi extends BangunDatar {
    private double sisi;

    /*======================= KONSTRUKTOR ======================== */
    // membuat konstruktor default
    public Persegi(){
        setJmlSisi(4);
    }

    // membuat konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    /*======================= SELEKTOR ======================== */
    // mendapatkan nilai sisi
    public double getSisi(){
        return sisi;
    }

    // mendapatkan nilai luas
    public double getLuas(){
        return Math.pow(sisi, 2);
    }

    // mendapatkan nilai keliling
    public double getKeliling(){
        return sisi*4;
    }

    // mendapatkan nilai diagonal
    public double getDiagonal(){
        return sisi*Math.sqrt(2);
    }

    /*======================= MUTATOR ======================== */
    // mengubah nilai sisi
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    
    /*======================= METHOD LAIN ======================== */
    @Override
    // menampilkan informasi persegi
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}
