/* Nama File   : MMahasiswa.java
 * Deskripsi   : Main program untuk class Mahasiswa
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 26 Februari 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3); // membuat objek MataKuliah PBO menggunakan konstruktor berparameter
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3); // membuat objek MataKuliah MBD menggunakan konstruktor berparameter
        Mahasiswa M1 = new Mahasiswa("24060124130117", "Rofad", "Informatika"); // membuat objek Mahasiswa M1 menggunakan konstruktor berparameter
        Dosen D1 = new Dosen("123", "Andi", "Informatika"); // membuat objek Dosen D1 menggunakan konstruktor berparameter
        Kendaraan K1 = new Kendaraan("H1234AB", "motor"); // membuat objek Kendaraan K1 menggunakan konstruktor berparameter

        M1.setdosenWali(D1); // mengubah dosen wali mahasiswa M1 menggunakan method mutator
        M1.setkendaraan(K1); // mengubah kendaraan mahasiswa M1 menggunakan method mutator
        
        M1.addMatKul(PBO); // menambahkan mata kuliah PBO ke dalam daftar mata kuliah mahasiswa
        M1.addMatKul(MBD); // menambahkan mata kuliah MBD ke dalam daftar mata kuliah mahasiswa

        System.out.println("NIM: " + M1.getnim()); // mengambil nilai NIM mahasiswa menggunakan method selektor
        System.out.println("Nama: " + M1.getnama()); // mengambil nilai nama mahasiswa menggunakan method selektor
        System.out.println("Prodi: " + M1.getprodi()); // mengambil nilai program studi mahasiswa menggunakan method selektor
        System.out.println("Dosen Wali: " + M1.getdosenWali().getNama()); // mengambil objek dosen wali kemudian mengambil nama dosen wali
        System.out.println("Kendaraan: " + M1.getkendaraan().getjenis() + " dengan plat nomor " + M1.getkendaraan().getnoPlat()); // mengambil jenis kendaraan dan plat nomor kendaraan mahasiswa
        
        System.out.println("\nData Mahasiswa:");
        M1.printMhs(); // mencetak informasi dasar mahasiswa (nim, nama, prodi)
        System.out.println("\nDetail Mahasiswa:");
        M1.printDetailMhs(); // mencetak detail mahasiswa beserta daftar mata kuliah yang diambil

        System.out.println("\nJumlah Mata Kuliah = " + M1.getJumlahMatKul()); // menghitung jumlah mata kuliah yang diambil mahasiswa
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS()); // menghitung total SKS dari seluruh mata kuliah mahasiswa

        System.out.println("\nDaftar Mata Kuliah:");
        for (int i = 0; i < M1.getListMatkul().size(); i++) {
            System.out.println(M1.getListMatkul().get(i).getNama()); // mengambil list mata kuliah menggunakan selektor getListMatkul()
        }

        System.out.print("\nJumlah Mahasiswa = ");
        M1.printCounterMhs(); // menampilkan jumlah objek mahasiswa yang telah dibuat
    }
}