/**
 * Nama File    : DiskonLambda.java
 * Deskripsi    : Ekspresi lambda dasar, digunakan untuk menghitung diskon.
 * Pembuat      : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal      : 3 Juni 2026
 */
// membuat interface IDiskon dengan method hitungDiskon
interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        //tanpa lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };
        //dengan lambda (sederhana dengan 1 line)
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        //dengan lambda dengan blok statement (lebih dari 1 line)
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: "+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: "+diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: "+diskonBiasa.hitungDiskon(45000));
    }
}