/* Nama File   : MManusia.java
 * Deskripsi   : Main program untuk class Manusia, PNS, Pengusaha, dan Petani
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 26 Maret 2026
 */

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        // membuat objek PNS, Pengusaha, dan Petani
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 4, 1), "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 1, 1), "Jl.Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
        PNS p2 = new PNS("Panji", LocalDate.of(2010, 4, 1)," " ,10000000, "198004212010041002");

        // mengubah alamat p2
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        // menampilkan jumlah objek manusia, PNS, Pengusaha, dan Petani yang telah dibuat
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        // menampilkan informasi PNS, Pengusaha, dan Petani
        System.out.println("\nPajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        // menampilkan masa kerja PNS, Pengusaha, dan Petani
        System.out.println("\nMasa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        // menampilkan informasi PNS, Pengusaha, dan Petani
        System.out.println("\n=========================================================");
        p1.cetakInfo();

        System.out.println("\n=========================================================");
        pe1.cetakInfo();

        System.out.println("\n=========================================================");
        pt1.cetakInfo();
    }
}