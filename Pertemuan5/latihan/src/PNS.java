/* Nama File   : PNS.java
 * Deskripsi   : berisi atribut dan method dalam class PNS
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 26 Maret 2026
 */

import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    /*======================= KONSTRUKTOR ======================== */
    // membuat konstruktor default
    public PNS(){
        counterPNS++;
    }

    // membuat konstruktor dengan parameter
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    /*======================= SELEKTOR ======================== */
    // mendapatkan nilai nip
    public String getNip(){
        return nip;
    }

    // mendapatkan jumlah objek PNS yang telah dibuat
    public static int getCounterPNS(){
        return counterPNS;
    }

    /*======================= MUTATOR ======================== */
    // mengubah nilai nip
    public void setNip(String nip){
        this.nip = nip;
    }
    
    /*======================= METHOD LAIN ======================== */
    @Override
    // menghitung masa kerja PNS
    public int hitungMasaKerja(){
        LocalDate sekarang = LocalDate.now();
        int masaKerja = sekarang.getYear() - getTgl_mulai_kerja().getYear() + 7;
        return masaKerja;
    }

    // menghitung pajak yang harus dibayar PNS
    @Override
    public double hitungPajak(){
        return 0.1 * getPendapatan();
    }

    // menampilkan informasi PNS
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP\t\t\t: " + nip);
        System.out.println("Masa Kerja\t\t: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak yang harus dibayar: " + hitungPajak());
    }

    // menampilkan jumlah objek manusia yang telah dibuat
    public static void printcounterPNS(){
        System.out.println("Jumlah Objek PNS: " + getCounterPNS());
    }
}
