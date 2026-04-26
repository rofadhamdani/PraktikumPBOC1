/* Nama File   : coersion.java
 * Deskripsi   : Program untuk melakukan konversi tipe data
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 23 April 2026
 */

public class coersion {
    public static void main(String[] args){
        // a. konversi integer ke karakter dan real
        int nilai = 65;
        System.out.println("tampilan integer : " + nilai);
        System.out.println("tampilan karakter : " + (char)nilai);
        System.out.println("tampilan real : " + (double)nilai);

        // b. nilai integer yang sudah diubah menjadi real, akan dikembalikan ke format integer di dalam variabel yang berbeda
        double nilaiReal = (double)nilai;
        int nilaiInteger = (int)nilaiReal;
        System.out.println("nilai real : " + nilaiReal);
        System.out.println("kembali ke integer : " + nilaiInteger);

        // c. konkatenasi dan penjumlahan String X dan Y
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("konkatenasi X dan Y : " + S);
        System.out.println("penjumlahan X dan Y : " + Z);

        // d. konkatenasi dan penjumlahan String P dan Q
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("konkatenasi P dan Q : " + R);
        System.out.println("penjumlahan P dan Q : " + D);

        // e. konversi nilai S ke Integer
        Integer A = Integer.parseInt(S);
        System.out.println("konversi S ke Integer A : " + A);
        System.out.println("Tipe A : " + A.getClass().getSimpleName());

        // f. konversi nilai A ke String
        String T = A.toString();
        System.out.println("konversi A ke String T : " + T);
        System.out.println("Tipe T : " + T.getClass().getSimpleName());
    }
}
