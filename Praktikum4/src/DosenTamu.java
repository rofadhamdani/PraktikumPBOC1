/* Nama File   : DosenTamu.java
 * Deskripsi   : berisi atribut dan method dalam class DosenTamu
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 25 Maret 2026
 */

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate tglBerakhirKontrak;

    /*======================= KONSTRUKTOR ======================== */
    // membuat konstruktor default
    public DosenTamu(){
    }

    // membuat konstruktor dengan parameter
    public DosenTamu(String NIDK, LocalDate tglBerakhirKontrak, String fakultas, String NIP, String nama, LocalDate tanggalLahir, LocalDate TMTbekerja, double gajiPokok){
        super(fakultas, NIP, nama, tanggalLahir, TMTbekerja, gajiPokok);
        this.NIDK = NIDK;
        this.tglBerakhirKontrak = tglBerakhirKontrak;
    }

    /*======================= SELEKTOR ======================== */
    // mendapatkan NIDK DosenTamu
    public String getNIDK(){
        return NIDK;
    }
    
    // mendapatkan tanggal berakhir kontrak DosenTamu
    public LocalDate getTglBerakhirKontrak(){
        return tglBerakhirKontrak;
    }

    /*======================= MUTATOR ======================== */
    // mengubah nilai NIDK DosenTamu
    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    // mengubah nilai tanggal berakhir kontrak DosenTamu
    public void setTglBerakhirKontrak(LocalDate tglBerakhirKontrak){
        this.tglBerakhirKontrak = tglBerakhirKontrak;
    }

    /*======================= METHOD LAIN ======================== */
    // menghitung tunjangan DosenTamu (2,5% dikali gaji pokok)
    public double getTunjangan(){
        return 0.025*gajiPokok;
    }

    // menghitung masa kontrak berakhir DosenTamu dalam bulan (selisih antara tanggal berakhir kontrak dengan tanggal sekarang)
    public int masaKontrak(){
        LocalDate now = LocalDate.now();
        return (int) java.time.temporal.ChronoUnit.MONTHS.between(now, tglBerakhirKontrak);
    }

    @Override
    // menampilkan informasi detail DosenTamu
    public void printInfo(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String formatGaji = formatRupiah.format(gajiPokok).replace("Rp", "Rp ");
        String formatTunjangan = formatRupiah.format(getTunjangan()).replace("Rp", "Rp ");
        super.printInfo();
        System.out.println("NIDK\t\t\t: " + NIDK);
        System.out.println("Jabatan\t\t\t: Dosen Tamu");
        System.out.println("Tanggal Berakhir Kontrak: " + getTglBerakhirKontrak().format(format));
        System.out.println("Tunjangan\t\t: 2,5% x " + formatGaji + " = " + formatTunjangan);
        System.out.println("Masa Kontrak Berakhir\t: " + masaKontrak() + " bulan");
    }
}