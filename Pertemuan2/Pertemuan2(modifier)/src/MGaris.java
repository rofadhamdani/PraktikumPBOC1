/* Nama File   : MGaris.java
 * Deskripsi   : berisi atribut dan method dalam class Garis
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117
 * Tanggal     : 4 Maret 2026
 */

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(0,0);
        Titik T2 = new Titik(4,4);
        Titik T3 = new Titik(0,4);
        Titik T4 = new Titik(4,0);

        Garis G1 = new Garis(T1,T2);
        Garis G2 = new Garis(T3,T4);

        G1.printGaris();
        System.out.println("Panjang: " + G1.panjangGaris());
        System.out.println("Gradien: " + G1.gradienGaris());
        System.out.println("Titik Tengah: ");
        G1.tTengah().printTitik();
        System.out.println("Persamaan: " + G1.persamaanGaris());

        System.out.println();

        G2.printGaris();
        System.out.println("Gradien: " + G2.gradienGaris());
        System.out.println("Persamaan: " + G2.persamaanGaris());

        System.out.println();

        System.out.println("Sejajar: " + G1.isSejajar(G2));
        System.out.println("Tegak Lurus: " + G1.isTegakLurus(G2));
        System.out.println("Jumlah Garis: " + Garis.getCounterGaris());
    }
}