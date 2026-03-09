/* Nama File   : MTitik.java
 * Deskripsi   : Main program untuk class Titik
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 20 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();               //Membuat objek titik T1 (0,0)
        T1.setAbsis(3);                     //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);                  //mengubah ordinat T1 dengan nilai 4
        System.err.println(T1.getAbsis());          //mengambil nilai absis T1
        System.err.println(T1.getOrdinat());        //mengambil nilai ordinat T1
        T1.printTitik();                        //mencetak koordinat T1 ke layar
        T1.geser(3,4);               //menggeser T1 sejauh (3,4)
        T1.printTitik();                    //menampilkan koordinat T1 setelah digeser
    }
}