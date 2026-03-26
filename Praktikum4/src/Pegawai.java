/* Nama File   : Pegawai.java
 * Deskripsi   : berisi atribut dan method dalam class Pegawai
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 25 Maret 2026
 */

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    protected String NIP;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMTbekerja;
    protected double gajiPokok;

    /*======================= KONSTRUKTOR ======================== */
    // membuat konstruktor default
    public Pegawai(){
    }

    // membuat konstruktor dengan parameter
    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMTbekerja, double gajiPokok){
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMTbekerja = TMTbekerja;
        this.gajiPokok = gajiPokok;
    }

    /*======================= SELEKTOR ======================== */
    // mendapatkan NIP Pegawai
    public String getNIP(){
        return NIP;
    }

    // mendapatkan nama Pegawai
    public String getnama(){
        return nama;
    }

    // mendapatkan tanggal lahir Pegawai
    public LocalDate getTanggalLahir(){
        return tanggalLahir;
    }

    // mendapatkan TMT bekerja Pegawai
    public LocalDate getTMTbekerja(){
        return TMTbekerja;
    }

    // mendapatkan gaji pokok Pegawai
    public double getGajiPokok(){
        return gajiPokok;
    }

    /*======================= MUTATOR ======================== */
    // mengubah nilai NIP Pegawai
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    // mengubah nilai nama Pegawai
    public void setNama(String nama){
        this.nama = nama;
    }

    // mengubah nilai tanggal lahir Pegawai
    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    // mengubah nilai TMT bekerja Pegawai
    public void setTMTbekerja(LocalDate TMTbekerja){
        this.TMTbekerja = TMTbekerja;
    }

    // mengubah nilai gaji pokok Pegawai
    public void setGajiPokok(double gajiPokok){    
        this.gajiPokok = gajiPokok;
    }

    /*======================= METHOD LAIN ======================== */
    // menghitung masa kerja Pegawai
    public String MasaKerja(){
        Period p = Period.between(TMTbekerja, LocalDate.now());
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    // menampilkan informasi detail Pegawai
    public void printInfo(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String formatGaji = formatRupiah.format(gajiPokok).replace("Rp", "Rp ");
        System.out.println("NIP\t\t\t: " + NIP);
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Tanggal Lahir\t\t: " + tanggalLahir.format(format));
        System.out.println("TMT\t\t\t: " + TMTbekerja.format(format));
        System.out.println("Masa Kerja\t\t: " + MasaKerja());
        System.out.println("Gaji Pokok\t\t: " + formatGaji);
    }
}