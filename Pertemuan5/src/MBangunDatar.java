/* Nama File   : MBangunDatar.java
 * Deskripsi   : Main program untuk class BangunDatar
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 26 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar(); // tidak bisa membuat objek BangunDatar karena class BangunDatar adalah abstract
        BangunDatar P1 = new Persegi(10, "Merah", "Putih");
        Persegi P2 = new Persegi(5, "Biru", "Merah");
        BangunDatar L1 = new Lingkaran(7, "Hijau", "Kuning");
        Lingkaran L2 = new Lingkaran(14, "Merah", "Biru");

        // BangunDatar P1 = new Persegi(4.0, "Merah", "Putih"); // membuat objek Persegi dengan tipe BangunDatar
        // BangunDatar L1 = new Lingkaran(3.0, "Biru", "Hitam"); // membuat objek Lingkaran dengan tipe BangunDatar
        
        System.out.println("sisi P1: " + ((Persegi)(P1)).getSisi()); // menampilkan nilai sisi P1
        System.out.println("luas P1: " + ((Persegi)(P1)).getLuas()); // menampilkan nilai luas P1
        System.out.println("keliling P1: " + ((Persegi)(P1)).getKeliling()); // menampilkan nilai keliling P1
        System.out.println("diagonal P1: " + ((Persegi)(P1)).getDiagonal()); // menampilkan nilai diagonal P1
        ((Persegi)(P1)).printInfo(); // menampilkan informasi persegi

        System.out.println("\n===============================\n");

        System.out.println("sisi P2: " + ((Persegi)(P2)).getSisi()); // menampilkan nilai sisi P2
        System.out.println("luas P2: " + ((Persegi)(P2)).getLuas()); // menampilkan nilai luas P2
        System.out.println("keliling P2: " + ((Persegi)(P2)).getKeliling()); // menampilkan nilai keliling P2
        System.out.println("diagonal P2: " + ((Persegi)(P2)).getDiagonal()); // menampilkan nilai diagonal P2
        ((Persegi)(P2)).printInfo(); // menampilkan informasi persegi

        System.out.println("\n===============================\n");

        System.out.println("jari-jari L1: " + ((Lingkaran)(L1)).getJari()); // menampilkan nilai jari-jari L1
        System.out.println("Luas L1: " + ((Lingkaran)(L1)).getLuas()); // menampilkan nilai luas L1
        System.out.println("keliling L1: " + ((Lingkaran)(L1)).getKeliling()); // menampilkan nilai keliling L1
        ((Lingkaran)(L1)).printInfo(); // menampilkan informasi lingkaran

        System.out.println("\n===============================\n");

        System.out.println("jari-jari L2: " + ((Lingkaran)(L2)).getJari()); // menampilkan nilai jari-jari L2
        System.out.println("Luas L2: " + ((Lingkaran)(L2)).getLuas()); // menampilkan nilai luas L2
        System.out.println("keliling L2: " + ((Lingkaran)(L2)).getKeliling()); // menampilkan nilai keliling L2
        ((Lingkaran)(L2)).printInfo(); // menampilkan informasi lingkaran

        System.out.println("\n===============================\n");

        System.out.println("Apakah P1 dan L1 memiliki luas yang sama? " + P1.isEqualLuas(L1)); // menampilkan apakah P1 dan L1 memiliki luas yang sama
        System.out.println("Apakah P2 dan L2 memiliki luas yang sama? " + P2.isEqualLuas(L2)); // menampilkan apakah P2 dan L2 memiliki luas yang sama

        System.out.println("\n===============================\n");

        System.out.println("sisi P2: " + ((Persegi)(P2)).getSisi()); // menampilkan nilai sisi P2 sebelum diubah
        System.out.println("jari-jari L2: " + ((Lingkaran)(L2)).getJari()); // menampilkan nilai jari-jari L2 sebelum diubah
        System.out.println("sisi P1: " + ((Persegi)(P1)).getSisi()); // menampilkan nilai sisi P1 sebelum diubah

        P2.zoomIn(); // memperbesar ukuran P2
        L2.zoomOut(); // memperkecil ukuran L2 
        ((Persegi)(P1)).zoom(150); // memperbesar ukuran P1 sebesar 150%

        System.out.println("\n===============================\n");

        System.out.println("sisi P2: " + ((Persegi)(P2)).getSisi()); // menampilkan nilai sisi P2 setelah diubah
        System.out.println("jari-jari L2: " + ((Lingkaran)(L2)).getJari()); // menampilkan nilai jari-jari L2 setelah diubah
        System.out.println("sisi P1: " + ((Persegi)(P1)).getSisi()); // menampilkan nilai sisi P1 setelah diubah
    }
}
