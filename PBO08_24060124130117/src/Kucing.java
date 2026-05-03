/* Nama File   : Kucing.java
 * Deskripsi   : Program untuk membuat kelas Kucing yaitu kelas anak dari Anabul
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 23 April 2026
 */

public class Kucing extends Anabul {
    // atribut
    private double bobot;

    // konstruktor
    public Kucing(String nama, double bobot){
        super(nama);
        this.bobot = bobot;
    }

    // method
    public double getBobot(){
        return bobot;
    }

    @Override
    public void gerak(){
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara(){
        System.out.println(nama + " berbunyi meong");
    }
}