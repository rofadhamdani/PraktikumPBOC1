/* Nama File   : Datum.java
 * Deskripsi   : Program untuk membuat kelas Datum yaitu kelas Generik yang menampung berbagai tipe data
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 3 Mei 2026
 */

public class Datum<T> {
    // atribut generik
    private T isi;

    // konstruktor
    public Datum(T isi){
        this.isi = isi;
    }

    // selektor
    public T getIsi(){
        return isi;
    }

    // mutator
    public void setIsi(T isiBaru){
        this.isi = isiBaru;
    }
}
