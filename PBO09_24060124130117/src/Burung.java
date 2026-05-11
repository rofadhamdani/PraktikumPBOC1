/* Nama File   : Burung.java
 * Deskripsi   : Program untuk membuat kelas Burung yaitu kelas anak dari Anabul
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 23 April 2026
 */

public class Burung extends Anabul {
    // konstruktor
    public Burung(String nama, String panggilan){
        super(nama, panggilan);
    }

    // method
    @Override
    public void gerak(){
        System.out.println(nama + " bergerak dengan terbang");
    }

    @Override
    public void bersuara(){
        System.out.println(nama + " berbunyi cuit");
    }
}