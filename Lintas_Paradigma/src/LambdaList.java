import java.util.ArrayList;

/**
 * Nama File    : LambdaList.java
 * Deskripsi    : Implementasi lambda pada List, digunakan sebagai parameter pada method.
 * Pembuat      : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal      : 3 Juni 2026
 */
public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}