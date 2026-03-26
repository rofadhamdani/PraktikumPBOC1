/* Nama File   : MPegawai.java
 * Deskripsi   : Main program untuk membuat objek Pegawai, Tendik, Dosen, DosenTetap, dan DosenTamu serta menampilkan informasi detailnya
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 25 Maret 2026
 */

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        // membuat contoh objek Pegawai P1
        Pegawai P1 = new Pegawai("1234567890", "Rofad", LocalDate.of(2000, 7, 11), LocalDate.of(2020, 8, 1), 5500000);

        // membuat contoh objek Tendik T1
        Tendik T1 = new Tendik("Akademik", "1357924680", "Laura", LocalDate.of(1995, 3, 21), LocalDate.of(2019, 2, 15), 4500000);

        // membuat contoh objek Dosen D1
        Dosen D1 = new Dosen("Sains dan Matematika", "2468013579", "Arif", LocalDate.of(1988, 11, 5), LocalDate.of(2015, 9, 1), 7000000);

        // membuat contoh objek DosenTetap Dtt1
        DosenTetap Dtt1 = new DosenTetap("78647324", "Sains dan Matematika", "9545647548", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000);

        // membuat contoh objek DosenTamu Dta1
        DosenTamu Dta1 = new DosenTamu("42374687", LocalDate.of(2027, 12, 29), "Teknik", "1029384756", "Vania", LocalDate.of(1999, 4, 18), LocalDate.of(2022, 3, 1), 4000000);

        // menampilkan informasi detail Pegawai P1
        System.out.println("======================== Pegawai P1 ========================");
        P1.printInfo();
        System.out.println();

        // menampilkan informasi detail Tendik T1
        System.out.println("======================== Tendik T1 ========================");
        T1.printInfo();
        System.out.println();

        // menampilkan informasi detail Dosen D1
        System.out.println("======================== Dosen D1 ========================");
        D1.printInfo();
        System.out.println();

        // menampilkan informasi detail DosenTetap Dtt1
        System.out.println("======================== DosenTetap Dtt1 ========================");
        Dtt1.printInfo();
        System.out.println();

        // menampilkan informasi detail DosenTamu Dta1
        System.out.println("======================== DosenTamu Dta1 ========================");
        Dta1.printInfo();
        System.out.println();

        // BangunDatar P1 = new Persegi(4.0, "Merah", "Putih"); // membuat objek Persegi dengan tipe BangunDatar
        // BangunDatar L1 = new Lingkaran(3.0, "Biru", "Hitam"); // membuat objek Lingkaran dengan tipe BangunDatar
        
        // System.out.println("sisi P1: " + ((Persegi)(P1)).getSisi()); // menampilkan nilai sisi P1
        // System.out.println("luas P1: " + ((Persegi)(P1)).getLuas()); // menampilkan nilai luas P1
        // System.out.println("keliling P1: " + ((Persegi)(P1)).getKeliling()); // menampilkan nilai keliling P1
        // System.out.println("diagonal P1: " + ((Persegi)(P1)).getDiagonal()); // menampilkan nilai diagonal P1
        // ((Persegi)(P1)).printInfo(); // menampilkan informasi persegi

        // System.out.println("jari-jari L1: " + ((Lingkaran)(L1)).getJari()); // menampilkan nilai jari-jari L1
        // System.out.println("Luas L1: " + ((Lingkaran)(L1)).getLuas()); // menampilkan nilai luas L1
        // System.out.println("keliling L1: " + ((Lingkaran)(L1)).getKeliling()); // menampilkan nilai keliling L1
        // ((Lingkaran)(L1)).printInfo(); // menampilkan informasi lingkaran
    }
}
