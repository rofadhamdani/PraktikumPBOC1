/* Nama File   : Kembangtelon.java
 * Deskripsi   : Program untuk membuat kelas Kembangtelon yaitu kelas anak dari Kucing
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 3 Mei 2026
 */

public class Kembangtelon extends Kucing {
    // konstruktor
    public Kembangtelon(String nama, String panggilan, double bobot) {
        super(nama, panggilan, bobot);
    }

    // method
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan cepat");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara meong keras");
    }
}
