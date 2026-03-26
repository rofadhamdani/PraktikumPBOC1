/* Nama File   : MBangunDatar.java
 * Deskripsi   : Main program untuk class BangunDatar
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 12 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(4.0, "Merah", "Putih"); // membuat objek Persegi dengan tipe BangunDatar
        BangunDatar L1 = new Lingkaran(3.0, "Biru", "Hitam"); // membuat objek Lingkaran dengan tipe BangunDatar
        
        System.out.println("sisi P1: " + ((Persegi)(P1)).getSisi()); // menampilkan nilai sisi P1
        System.out.println("luas P1: " + ((Persegi)(P1)).getLuas()); // menampilkan nilai luas P1
        System.out.println("keliling P1: " + ((Persegi)(P1)).getKeliling()); // menampilkan nilai keliling P1
        System.out.println("diagonal P1: " + ((Persegi)(P1)).getDiagonal()); // menampilkan nilai diagonal P1
        ((Persegi)(P1)).printInfo(); // menampilkan informasi persegi

        System.out.println("jari-jari L1: " + ((Lingkaran)(L1)).getJari()); // menampilkan nilai jari-jari L1
        System.out.println("Luas L1: " + ((Lingkaran)(L1)).getLuas()); // menampilkan nilai luas L1
        System.out.println("keliling L1: " + ((Lingkaran)(L1)).getKeliling()); // menampilkan nilai keliling L1
        ((Lingkaran)(L1)).printInfo(); // menampilkan informasi lingkaran
    }
}
