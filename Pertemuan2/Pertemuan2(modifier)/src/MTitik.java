/* Nama File   : MTitik.java
 * Deskripsi   : Main program untuk class Titik
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 26 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();     //membuat objek titik T1 (0,0)
        T1.setAbsis(3);             //mengubah absis T1 menjadi 3
        T1.setOrdinat(4);           //mengubah ordinat T1 menjadi 4
        T1.printTitik();            //mencetak koordinat T1
        T1.geser(3,4);              //menggeser titik T1 sejauh (3,4)
        T1.printTitik();            //menampilkan koordinat T1 setelah digeser

        Titik T2 = new Titik(3, 5); //membuat objek titik T2 dengan koordinat (3,5)
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());
        
        System.out.println("Kuadran T1 = " + T1.getKuadran());
        System.out.println("Jarak T1 ke pusat = " + T1.getJarakPusat());
        System.out.println("Kuadran T2 = " + T2.getKuadran());
        System.out.println("Jarak T2 ke pusat = " + T2.getJarakPusat());
        System.out.println("Jarak T1 ke T2 = " + T1.getJarak(T2));

        T1.refleksiX();              //merefleksikan T1 terhadap sumbu X
        T1.printTitik();

        T1.refleksiY();              //merefleksikan T1 terhadap sumbu Y
        T1.printTitik();

        Titik T3 = T2.getRefleksiX(); //membuat titik baru hasil refleksi T2 terhadap sumbu X
        T3.printTitik();

        Titik T4 = T2.getRefleksiY(); //membuat titik baru hasil refleksi T2 terhadap sumbu Y
        T4.printTitik();
    }
}