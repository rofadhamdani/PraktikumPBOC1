/* Nama File   : Data.java
 * Deskripsi   : Program untuk membuat kelas Generik Data yang menampung berbagai tipe data dengan kapasitas tertentu
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 3 Mei 2026
 */

public class Data<T> {
    // atribut
    private static final int Kapasitas = 100;
    private T[] ruang;
    private int banyak;

    // konstruktor
    @SuppressWarnings("unchecked")
    public Data(){
        ruang = (T[]) new Object[Kapasitas];
        banyak = 0;
    }

    // method untuk mengembalikan isi array pada posisi tertentu
    public T getIsi(int posisi){
        if (posisi > 0 && posisi <= banyak && posisi <= Kapasitas){
            return (T) ruang[posisi-1];
        }
        else{
            return null;
        }
    }
    
    // method untuk mengubah isi array pada posisi tertentu
    public void setIsi(int posisi, T isi){
        if (posisi > 0 && posisi <= Kapasitas){
            ruang[posisi-1] = isi;
            if (posisi > banyak){
                banyak = posisi;
            }
        }
    }

    // method untuk mendapatkan banyaknya data yang tersimpan
    public int getSize(){
        return banyak;
    }
}
