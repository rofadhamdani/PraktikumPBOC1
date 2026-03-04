/* Nama File   : MTitik.java
 * Deskripsi   : berisi atribut dan method dalam class Titik
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117
 * Tanggal     : 26 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();  //Membuat objek titik T1 (0,0)
        T1.setAbsis(3);          //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);        //mengubah ordinat T1 dengan nilai 4
        T1.printTitik();         //mencetak koordinat T1 ke layar
        T1.geser(3,4);           //menggeser T1 sejauh (3,4)
        T1.printTitik();         //menampilkan koordinat T1 setelah digeser

        // Titik T2 = T1;
        // T2.printTitik();
        // T1.setAbsis(10);
        // T1.setOrdinat(10);
        // T2.printTitik();

        Titik T2 = new Titik(3, 5);
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());

        System.out.println("Kuadran T1 = " + T1.getKuadran());
        System.out.println("Jarak T1 ke pusat = " + T1.getJarakPusat());
        System.out.println("Kuadran T2 = " + T2.getKuadran());
        System.out.println("Jarak T2 ke pusat = " + T2.getJarakPusat());
        System.out.println("Jarak T1 ke T2 = " + T1.getJarak(T2));
        T1.refleksiX();
        T1.printTitik();
        T1.refleksiY();
        T1.printTitik();
        Titik T3 = T2.getRefleksiX();
        T3.printTitik();
        Titik T4 = T2.getRefleksiY();
        T4.printTitik();
    }
}