/* Nama File   : Main.java
 * Deskripsi   : Program untuk melakukan aplikasi pada kelas Civitasakademika, Dosen, Mahasiswa, Seminar
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 23 April 2026
 */

public class Main {
    public static void main(String[] args){
        // e. membuat 2 objek dosen dan 5 objek mahasiswa
        Civitasakademika dosen1 = new Dosen("Dr. Stone", "12800000");
        Civitasakademika dosen2 = new Dosen("Dr. Strange", "21043614");

        Civitasakademika mahasiswa1 = new Mahasiswa("Yudi", "24060124130001", (Dosen)dosen1);
        Civitasakademika mahasiswa2 = new Mahasiswa("Rahmat", "24060124130002", (Dosen)dosen2);
        Civitasakademika mahasiswa3 = new Mahasiswa("Nobara", "24060124130003", (Dosen)dosen1); 
        Civitasakademika mahasiswa4 = new Mahasiswa("Yuta", "24060124130004", (Dosen)dosen2);
        Civitasakademika mahasiswa5 = new Mahasiswa("Rika", "24060124130005", (Dosen)dosen1);

        // f. uji prosedur Registrasi dengan ketujuh objek peserta
        Seminar seminar = new Seminar();
        seminar.registrasi(dosen1);
        seminar.registrasi(dosen2);
        seminar.registrasi(mahasiswa1);
        seminar.registrasi(mahasiswa2);
        seminar.registrasi(mahasiswa3);
        seminar.registrasi(mahasiswa4);
        seminar.registrasi(mahasiswa5);

        // c. menghitung banyaknya peserta seminar
        System.out.println("\nBanyaknya peserta seminar: " + seminar.countPeserta() + "\n");

        // g. menampilkan daftar Nomor dan Nama semua peserta seminar
        seminar.tampilPeserta();

        // h. menghitung banyaknya peserta mahasiswa
        System.out.println("\nBanyaknya peserta mahasiswa: " + seminar.countMahasiswa());

        // i. mengubah isian komponen dosenwali dengan parameter input dosen
        ((Mahasiswa)mahasiswa1).setWali((Dosen)dosen2);
        System.out.println("\nDosen wali " + mahasiswa1.getNama() + " telah diubah.");

        // j. menampilkan data NIM, Nama Mahasiswa, dan Nama Dosenwali
        System.out.println("\nData Mahasiswa:");
        ((Mahasiswa)mahasiswa1).tampilDataMahasiswa();
        ((Mahasiswa)mahasiswa2).tampilDataMahasiswa();
        ((Mahasiswa)mahasiswa3).tampilDataMahasiswa();
        ((Mahasiswa)mahasiswa4).tampilDataMahasiswa();
        ((Mahasiswa)mahasiswa5).tampilDataMahasiswa();
    }
}