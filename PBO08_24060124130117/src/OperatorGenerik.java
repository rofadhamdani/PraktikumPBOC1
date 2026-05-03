/* Nama File   : OperatorGenerik.java
 * Deskripsi   : Program untuk membuat kelas Operator Generik yang berisi method generik untuk menukar elemen dan menjumlahkan bobot kucing
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 3 Mei 2026
 */

public class OperatorGenerik {
    // method generik untuk menukar elemen dalam array
    public static <T> void Tukar(T[] arr){
        if (arr.length >= 2){
            T temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }

    // method generik untuk menjumlahkan bobot dua kucing
    public static double Bobot2(Kucing k1, Kucing k2){
        return k1.getBobot() + k2.getBobot();
    } 
}
