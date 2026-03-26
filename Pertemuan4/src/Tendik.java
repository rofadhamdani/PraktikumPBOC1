/* Nama File   : Tendik.java
 * Deskripsi   : berisi atribut dan method dalam class Tendik
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 25 Maret 2026
 */

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tendik extends Pegawai {
    private int BUP = 55;
    private String bidang;

    /*======================= KONSTRUKTOR ======================== */
    // membuat konstruktor default
    public Tendik(){
    }

    // membuat konstruktor dengan parameter
    public Tendik(String bidang, String NIP, String nama, LocalDate tanggalLahir, LocalDate TMTbekerja, double gajiPokok){
        super(NIP, nama, tanggalLahir, TMTbekerja, gajiPokok);
        this.bidang = bidang;
    }

    /*======================= SELEKTOR ======================== */
    // mendapatkan Bidang Tendik
    public String getBidang(){
        return bidang;
    }

    /*======================= MUTATOR ======================== */
    // mengubah nilai Bidang Tendik
    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    /*======================= METHOD LAIN ======================== */
    // menghitung tunjangan Tendik (1% dikali masa kerja dalam tahun dikali gaji pokok)
    public double getTunjangan(){
        Period p = Period.between(TMTbekerja, LocalDate.now());
        return 0.01*p.getYears()*gajiPokok;
    }

    // menghitung tanggal pensiun Tendik (1 bulan berikutnya dari tanggal lahir + BUP)
    public LocalDate getTglPensiun(){
        LocalDate tglPensiun = tanggalLahir.plusMonths(1).plusYears(BUP);
        return tglPensiun;
    }

    @Override
    // menampilkan informasi detail Tendik
    public void printInfo(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String formatGaji = formatRupiah.format(gajiPokok).replace("Rp", "Rp ");
        String formatTunjangan = formatRupiah.format(getTunjangan()).replace("Rp", "Rp ");
        Period p = Period.between(TMTbekerja, LocalDate.now());
        super.printInfo();
        System.out.println("Jabatan\t\t\t: Tenaga Kependidikan");
        System.out.println("Bidang\t\t\t: " + bidang);
        System.out.println("Tanggal Pensiun\t\t: " + getTglPensiun().format(format));
        System.out.println("Tunjangan\t\t: 1% x " + p.getYears() + " x " + formatGaji + " = " + formatTunjangan);
    }
}