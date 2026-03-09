/* Nama File   : MGaris.java
 * Deskripsi   : Main program untuk class Garis
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 26 Februari 2026
 */

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(0,0); //membuat titik (0,0)
        Titik T2 = new Titik(4,4); //membuat titik (4,4)
        Titik T3 = new Titik(0,4); //membuat titik (0,4)
        Titik T4 = new Titik(4,0); //membuat titik (4,0)

        Garis G1 = new Garis(T1,T2); //membuat garis dari T1 ke T2
        Garis G2 = new Garis(T3,T4); //membuat garis dari T3 ke T4
        Garis G3 = new Garis(); //membuat garis default dari (0,0) ke (1,1)

        System.out.println("Titik awal G1:");
        G1.getTitikAwal().printTitik(); //mengambil titik awal garis G1
        System.out.println("Titik akhir G1:");
        G1.getTitikAkhir().printTitik(); //mengambil titik akhir garis G1

        G3.setTitikAwal(new Titik(2,2)); //mengubah titik awal garis G3
        G3.setTitikAkhir(new Titik(6,6)); //mengubah titik akhir garis G3

        G1.printGaris(); //mencetak titik awal dan titik akhir garis

        System.out.println("Panjang G1 = " + G1.panjangGaris()); //menghitung panjang garis G1
        System.out.println("Gradien G1 = " + G1.gradienGaris()); //menghitung gradien garis G1

        System.out.println("Titik Tengah G1:");
        G1.tTengah().printTitik(); //menghitung dan mencetak titik tengah garis G1

        System.out.println("Apakah G1 sejajar G2? " + G1.isSejajar(G2)); //mengecek apakah G1 sejajar dengan G2
        System.out.println("Apakah G1 tegak lurus G2? " + G1.isTegakLurus(G2)); //mengecek apakah G1 tegak lurus dengan G2

        System.out.println("Persamaan G1 = " + G1.persamaanGaris()); //menghitung persamaan garis G1 dalam bentuk y = mx + c

        System.out.println("Jumlah objek Garis = " + Garis.getCounterGaris()); //mengambil jumlah objek Garis yang telah dibuat
    }
}