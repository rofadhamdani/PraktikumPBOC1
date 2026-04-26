/* Nama File   : Anjing.java
 * Deskripsi   : Program untuk membuat kelas Anjing yaitu kelas anak dari Anabul
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 23 April 2026
 */

public class Anjing extends Anabul {
    // konstruktor
    public Anjing(String nama){
        super(nama);
    }

    // method
    @Override
    public void gerak(){
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara(){
        System.out.println(nama + " bersuara guk-guk");
    }   
}