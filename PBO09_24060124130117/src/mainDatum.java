/* Nama File   : mainDatum.java
 * Deskripsi   : Program untuk melakukan aplikasi pada kelas generik Datum
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 3 Mei 2026
 */

public class mainDatum {
    public static void main(String[] args){
        // contoh penggunaan Datum dengan tipe data Integer
        System.out.println("Contoh penggunaan Datum dengan tipe data Integer:");
        Datum<Integer> datumInt = new Datum<>(117);
        System.out.println("isi datumInt: " + datumInt.getIsi());
        datumInt.setIsi(24);
        System.out.println("isi datumInt setelah diubah: " + datumInt.getIsi());

        // contoh penggunaan Datum dengan tipe data String
        System.out.println("\nContoh penggunaan Datum dengan tipe data String:");
        Datum<String> datumString = new Datum<>("Hewan Peliharaan");
        System.out.println("isi datumString: " + datumString.getIsi());
        datumString.setIsi("Kucing");
        System.out.println("isi datumString setelah diubah: " + datumString.getIsi());

        // contoh penggunaan Datum dengan tipe data Anggora
        System.out.println("\nContoh penggunaan Datum dengan tipe data Anggora:");
        Datum<Kucing> datumAnggora = new Datum<>(new Anggora("Kevin" , "Kevin", 4.5));
        System.out.println("isi datumAnggora: \n" + datumAnggora.getIsi().getNama()); 
        System.out.println("Bobot : " + datumAnggora.getIsi().getBobot() + " kg");
        datumAnggora.getIsi().gerak();
        datumAnggora.getIsi().bersuara();
        datumAnggora.setIsi(new Anggora("Luna", "Luna", 3.2));
        System.out.println("\nisi datumAnggora setelah diubah: \n" + datumAnggora.getIsi().getNama());
        System.out.println("Bobot : " + datumAnggora.getIsi().getBobot() + " kg");
        datumAnggora.getIsi().gerak();
        datumAnggora.getIsi().bersuara();
    }
}