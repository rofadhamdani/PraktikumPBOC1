/* Nama File   : Civitasakademika.java
 * Deskripsi   : Program untuk membuat kelas Civitasakademika sebagai kelas induk
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 23 April 2026
 */

public class Civitasakademika {
    // atribut
    protected String Nama;

    // konstruktor
    public Civitasakademika(String Nama){
        this.Nama = Nama;
    }

    // selektor
    public String getNama(){
        return Nama;
    }

    // mutator
    void setNama(String Nama){
        this.Nama = Nama;
    }

    // method lain (menyesuaikan kelas anak)
    public String getNomor(){
        return "";
    }
}
