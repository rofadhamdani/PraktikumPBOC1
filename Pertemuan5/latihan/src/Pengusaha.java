/* Nama File   : Pengusaha.java
 * Deskripsi   : berisi atribut dan method dalam class Pengusaha
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 26 Maret 2026
 */

import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    /*======================= KONSTRUKTOR ======================== */
    // membuat konstruktor default
    public Pengusaha(){
        counterPengusaha++;
    }

    // membuat konstruktor dengan parameter
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    /*======================= SELEKTOR ======================== */
    // mendapatkan nilai npwp
    public String getNpwp(){
        return npwp;
    }

    // mendapatkan jumlah objek Pengusaha yang telah dibuat
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    /*======================= MUTATOR ======================== */
    // mengubah nilai npwp
    public void setNpwp(String npwp){
        this.npwp = npwp;
    }
    
    /*======================= METHOD LAIN ======================== */
    @Override
    // menghitung masa kerja Pengusaha
    public int hitungMasaKerja(){
        LocalDate sekarang = LocalDate.now();
        int masaKerja = sekarang.getYear() - getTgl_mulai_kerja().getYear() + 1;
        return masaKerja;
    }

    // menghitung pajak yang harus dibayar Pengusaha
    @Override
    public double hitungPajak(){
        return 0.15 * getPendapatan();
    }

    // menampilkan informasi Pengusaha
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("npwp\t\t\t: " + npwp);
        System.out.println("Masa Kerja\t\t: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak yang harus dibayar: " + hitungPajak());
    }

    // menampilkan jumlah objek manusia yang telah dibuat
    public static void printcounterPengusaha(){
        System.out.println("Jumlah Objek Pengusaha: " + getCounterPengusaha());
    }
}
