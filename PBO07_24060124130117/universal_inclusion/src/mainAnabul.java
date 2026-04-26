/* Nama File   : mainAnabul.java
 * Deskripsi   : Program untuk melakukan aplikasi pada kelas Anabul dan kelas anaknya
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 23 April 2026
 */

public class mainAnabul {
    public static void main(String[] args){
        // membuat objek dari kelas Anjing, Kucing, dan Burung
        Anabul anjing1 = new Anjing("Dog");
        Anabul kucing1 = new Kucing("Cat");
        Anabul burung1 = new Burung("Bird");
        // memanggil method gerak dan bersuara pada Anjing
        System.out.println("Anjing:");
        anjing1.gerak();
        anjing1.bersuara();

        // memanggil method gerak dan bersuara pada Kucing
        System.out.println("\nKucing:");
        kucing1.gerak();
        kucing1.bersuara();

        // memanggil method gerak dan bersuara pada Burung
        System.out.println("\nBurung:");
        burung1.gerak();
        burung1.bersuara();
    }
}