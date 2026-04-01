/* Nama File   : Manusia.java
 * Deskripsi   : berisi atribut dan method dalam class Manusia
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 26 Maret 2026
 */

import java.time.LocalDate;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    /*======================= KONSTRUKTOR ======================== */
    // membuat konstruktor default
    public Manusia(){
        counterMns++;
    }

    // membuat konstruktor dengan parameter
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    /*======================= SELEKTOR ======================== */
    // mendapatkan nilai nama
    public String getNama(){
        return nama;
    }

    // mendapatkan nilai tgl mulai kerja
    public LocalDate getTgl_mulai_kerja(){
        return tgl_mulai_kerja;
    }

    // mendapatkan nilai alamat
    public String getAlamat(){
        return alamat;
    }

    // mendapatkan nilai pendapatan
    public double getPendapatan(){
        return pendapatan;
    }

    // mendapatkan jumlah objek manusia yang telah dibuat
    public static int getCounterMns(){
        return counterMns;
    }

    /*======================= MUTATOR ======================== */
    // mengubah nilai nama
    public void setNama(String nama){
        this.nama = nama;
    }

    // mengubah nilai tgl mulai kerja
    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    // mengubah nilai alamat
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    // mengubah nilai pendapatan
    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    /*======================= METHOD LAIN ======================== */
    // menghitung masa kerja manusia
    public abstract int hitungMasaKerja();

    // menampilkan informasi manusia
    public void cetakInfo(){
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Tanggal Mulai Kerja\t: " + tgl_mulai_kerja);
        System.out.println("Alamat\t\t\t: " + alamat);
        System.out.println("Pendapatan\t\t: " + pendapatan);
    }

    // menampilkan jumlah objek manusia yang telah dibuat
    public static void printcounterMns(){
        System.out.println("Jumlah Objek Manusia: " + getCounterMns());
    }
}
