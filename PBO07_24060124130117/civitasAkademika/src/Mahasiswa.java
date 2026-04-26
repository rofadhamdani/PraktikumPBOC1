/* Nama File   : Mahasiswa.java
 * Deskripsi   : Program untuk membuat kelas Mahasiswa (kelas anak Civitasakademika)
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 23 April 2026
 */

public class Mahasiswa extends Civitasakademika{
    // atribut
    private String NIM;
    private Dosen Dosenwali;

    // konstruktor
    public Mahasiswa(String Nama, String NIM, Dosen Dosenwali){
        super(Nama);
        this.NIM = NIM;
        this.Dosenwali = Dosenwali;
    }
    
    // selektor
    @Override
    public String getNomor(){
        return NIM;
    }

    public Dosen getDosenwali(){
        return Dosenwali;
    }

    // i. mengubah isian komponen dosenwali dengan parameter input dosen
    public void setWali(Dosen Dosenwali){
        this.Dosenwali = Dosenwali;
    }
    
    // j. menampilkan data NIM, Nama Mahasiswa, dan Nama Dosenwali
    public void tampilDataMahasiswa(){
        System.out.println("NIM: " + getNomor());
        System.out.println("Nama Mahasiswa: " + getNama());
        System.out.println("Dosen Wali: " + getDosenwali().getNama() + "\n");
    }
}
