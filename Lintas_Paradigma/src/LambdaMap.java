import java.util.HashMap;
import java.util.Map;

/**
 * Nama File    : LambdaMap.java
 * Deskripsi    : Implementasi lambda pada Map, digunakan sebagai parameter pada method.
 * Pembuat      : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal      : 3 Juni 2026
 */
public class LambdaMap {
    public static void main(String[] args) {
        //deklarasi Map
        Map<String, String> mahasiswaMap = new HashMap<>();

        //menambahkan data mahasiswa ke Map
        mahasiswaMap.put("24060124130011", "Adi");
        mahasiswaMap.put("24060124130012", "Bambang");
        mahasiswaMap.put("24060124130013", "Cici");
        mahasiswaMap.put("24060124130014", "Didi");

        //lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM : " + nim + ", Nama : " + nama));
    }
}