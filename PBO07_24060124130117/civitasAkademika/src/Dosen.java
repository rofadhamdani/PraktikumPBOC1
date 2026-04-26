/* Nama File   : Dosen.java
 * Deskripsi   : Program untuk membuat kelas Dosen (kelas anak Civitasakademika)
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 23 April 2026
 */

public class Dosen extends Civitasakademika{
    // atribut
    private String NIP;

    // konstruktor
    public Dosen(String Nama, String NIP){
        super(Nama);
        this.NIP = NIP;
    }

    // selektor
    @Override
    public String getNomor(){
        return NIP;
    }
}
