/* Nama File   : Petani.java
 * Deskripsi   : berisi atribut dan method dalam class Petani
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 26 Maret 2026
 */

import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    /*======================= KONSTRUKTOR ======================== */
    // membuat konstruktor default
    public Petani(){
        counterPetani++;
    }

    // membuat konstruktor dengan parameter
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    /*======================= SELEKTOR ======================== */
    // mendapatkan nilai asal_kota
    public String getAsal_kota(){
        return asal_kota;
    }

    // mendapatkan jumlah objek Petani yang telah dibuat
    public static int getCounterPetani(){
        return counterPetani;
    }

    /*======================= MUTATOR ======================== */
    // mengubah nilai asal_kota
    public void setAsal_kota(String asal_kota){
        this.asal_kota = asal_kota;
    }
    
    /*======================= METHOD LAIN ======================== */
    @Override
    // menghitung masa kerja Petani
    public int hitungMasaKerja(){
        LocalDate sekarang = LocalDate.now();
        int masaKerja = sekarang.getYear() - getTgl_mulai_kerja().getYear() + 1;
        return masaKerja;
    }

    // menghitung pajak yang harus dibayar Petani
    @Override
    public double hitungPajak(){
        return 0;
    }

    // menampilkan informasi Petani
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("asal_kota\t\t: " + asal_kota);
        System.out.println("Masa Kerja\t\t: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak yang harus dibayar: " + hitungPajak());
    }

    // menampilkan jumlah objek manusia yang telah dibuat
    public static void printcounterPetani(){
        System.out.println("Jumlah Objek Petani: " + getCounterPetani());
    }
}
