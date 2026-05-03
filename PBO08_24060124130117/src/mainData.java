/* Nama File   : mainData.java
 * Deskripsi   : Program untuk melakukan aplikasi pada kelas generik Data
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 3 Mei 2026
 */

public class mainData {
    public static void main(String[] args){
        // a. aplikasi dasar data dengan integer
        System.out.println("Aplikasi dasar data dengan integer:");
        Data<Integer> dataInt = new Data<>();
        System.out.println("Ukuran awal dataInt: " + dataInt.getSize());

        // mengisi dataInt dengan beberapa nilai integer
        dataInt.setIsi(1, 10);
        dataInt.setIsi(2, 20);
        dataInt.setIsi(3, 30);
        dataInt.setIsi(5, 50);
        System.out.println("Ukuran setelah mengisi dataInt: " + dataInt.getSize());
        // menampilkan isi dataInt
        for (int i = 1; i <= dataInt.getSize(); i++){
            System.out.println("Nilai di posisi " + i + " = " + dataInt.getIsi(i));
        }

        // a. aplikasi dasar data dengan string
        System.out.println("\nAplikasi dasar data dengan string:");
        Data<String> dataString = new Data<>();
        System.out.println("Ukuran awal dataString: " + dataString.getSize());

        // mengisi dataString dengan beberapa nilai string
        dataString.setIsi(1, "Hello");
        dataString.setIsi(2, "World");
        dataString.setIsi(4, "Java");
        System.out.println("Ukuran setelah mengisi dataString: " + dataString.getSize());
        // menampilkan isi dataString
        for (int i = 1; i <= dataString.getSize(); i++){
            System.out.println("Nilai di posisi " + i + " = " + dataString.getIsi(i));
        }

        // b, c, d aplikasi dasar data dengan keluarga Anabul
        System.out.println("\nAplikasi dasar data dengan keluarga Anabul:");
        Data<Anabul> dataAnabul = new Data<>();
        System.out.println("Ukuran awal dataAnabul: " + dataAnabul.getSize());
        // b. mengisi dataAnabul dengan beberapa objek Anabul
        dataAnabul.setIsi(1, new Anjing("Nabil"));
        dataAnabul.setIsi(2, new Kucing("Kicaw", 4.0));
        dataAnabul.setIsi(3, new Burung("Mania"));

        // d. menampilkan ukuran dataAnabul
        System.out.println("Ukuran setelah mengisi dataAnabul: " + dataAnabul.getSize());
        
        // c.menampilkan isi dataAnabul
        for (int i = 1; i <= dataAnabul.getSize(); i++){
            Anabul anabul = dataAnabul.getIsi(i);
            if (anabul != null){
                System.out.println("Anabul di posisi " + i + " = " + anabul.getNama());
            }
        }
    }
}