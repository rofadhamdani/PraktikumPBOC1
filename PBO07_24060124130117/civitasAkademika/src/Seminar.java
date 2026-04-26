/* Nama File   : Seminar.java
 * Deskripsi   : Program untuk membuat kelas Seminar yang dapat menampung peserta seminar (kelas Civitasakademika)
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 23 April 2026
 */

public class Seminar {
    // atribut
    private Civitasakademika[] pesertas = new Civitasakademika[100];
    private int banyakpeserta;

    // konstruktor
    public Seminar(){
        banyakpeserta = 0;
    }

    // c. menghitung banyaknya peserta seminar
    public int countPeserta(){
        return banyakpeserta;
    }

    // d. menambahkan seorang peserta dengan parameter masukan sebuah objek Civitasakademika
    public void registrasi(Civitasakademika peserta){
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = peserta;
            banyakpeserta++;
        }
        else {
            System.out.println("Seminar sudah penuh!");
        }
    }

    // g. menampilkan daftar Nomor dan Nama semua peserta seminar
    public void tampilPeserta(){
        System.out.println("Daftar Peserta Seminar:");
        for (int i=0; i <banyakpeserta; i++) {
            System.out.println((i + 1) + ".\tNomor: " + pesertas[i].getNomor());
            System.out.println("\tNama: " + pesertas[i].getNama());
        }
    }

    // h. menghitung banyaknya peserta mahasiswa
    public int countMahasiswa(){
        int mhs = 0;
        for (int i=0; i<banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa){
                mhs++;
            }
        }
        return mhs;
    }
}
