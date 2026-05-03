/* Nama File   : mainOperator.java
 * Deskripsi   : Program untuk melakukan aplikasi pada kelas generik OperatorGenerik
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 3 Mei 2026
 */

public class mainOperator {
    public static void main(String[] args){
        // aplikasi prosedur generik tukar untuk sesama integer
        System.out.println("Contoh aplikasi prosedur generik tukar untuk sesama integer:");
        Integer[] angka = {6, 3};
        System.out.println("Sebelum ditukar: " + angka[0] + " " + angka[1]);
        OperatorGenerik.Tukar(angka);
        System.out.println("Setelah ditukar: " + angka[0] + " " + angka[1]);

        // aplikasi prosedur generik tukar untuk sesama string
        System.out.println("\nContoh aplikasi prosedur generik tukar untuk sesama string:");
        String[] kata = {"Operator", "Generik"};
        System.out.println("Sebelum ditukar: " + kata[0] + " " + kata[1]);
        OperatorGenerik.Tukar(kata);
        System.out.println("Setelah ditukar: " + kata[0] + " " + kata[1]);

        // aplikasi prosedur generik tukar untuk sesama keluarga Anabul
        System.out.println("\nContoh aplikasi prosedur generik tukar untuk sesama keluarga Anabul:");
        Anabul kucing = new Kucing("Kitty", 4.5);
        Anabul Anjing = new Anjing("Doggy");
        Anabul[] anabulArray = {kucing, Anjing};
        System.out.println("Sebelum ditukar: " + anabulArray[0].getNama() + " dan " + anabulArray[1].getNama());
        OperatorGenerik.Tukar(anabulArray);
        System.out.println("Setelah ditukar: " + anabulArray[0].getNama() + " dan " + anabulArray[1].getNama());

        // aplikasi fungsi generik untuk menjumlahkan bobot dua kucing
        System.out.println("\nContoh aplikasi fungsi generik untuk menjumlahkan bobot dua kucing:");
        Kucing kucing1 = new Kucing("Garfield", 3.5);
        System.out.println("Bobot kucing 1 adalah " + kucing1.getBobot() + " kg");
        Kucing kucing2 = new Kucing("Tom", 1.5);
        System.out.println("Bobot kucing 2 adalah " + kucing2.getBobot() + " kg");
        System.out.println("Jumlah bobot kucing adalah " + OperatorGenerik.Bobot2(kucing1, kucing2) + " kg");
    }   
}
