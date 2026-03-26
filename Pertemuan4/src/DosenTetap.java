/* Nama File   : DosenTetap.java
 * Deskripsi   : berisi atribut dan method dalam class DosenTetap
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 25 Maret 2026
 */

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTetap extends Dosen {
    private String NIDN;
    private int BUP = 65;

    /*======================= KONSTRUKTOR ======================== */
    // membuat konstruktor default
    public DosenTetap(){
    }

    // membuat konstruktor dengan parameter
    public DosenTetap(String NIDN, String fakultas, String NIP, String nama, LocalDate tanggalLahir, LocalDate TMTbekerja, double gajiPokok){
        super(fakultas, NIP, nama, tanggalLahir, TMTbekerja, gajiPokok);
        this.NIDN = NIDN;
    }

    /*======================= SELEKTOR ======================== */
    // mendapatkan NIDN DosenTetap
    public String getNIDN(){
        return NIDN;
    }

    /*======================= MUTATOR ======================== */
    // mengubah nilai NIDN DosenTetap
    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    /*======================= METHOD LAIN ======================== */
    // menghitung tunjangan DosenTetap (2% dikali masa kerja dalam tahun dikali gaji pokok)
    public double getTunjangan(){
        Period p = Period.between(TMTbekerja, LocalDate.now());
        return 0.02*p.getYears()*gajiPokok;
    }

    // menghitung tanggal pensiun DosenTetap (1 bulan berikutnya dari tanggal lahir + BUP)
    public LocalDate getTglPensiun(){
        LocalDate tglPensiun = tanggalLahir.plusMonths(1).plusYears(BUP);
        return tglPensiun;
    }

    @Override
    // menampilkan informasi detail DosenTetap
    public void printInfo(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String formatGaji = formatRupiah.format(gajiPokok).replace("Rp", "Rp ");
        String formatTunjangan = formatRupiah.format(getTunjangan()).replace("Rp", "Rp ");
        Period p = Period.between(TMTbekerja, LocalDate.now());
        super.printInfo();
        System.out.println("NIDN\t\t\t: " + NIDN);
        System.out.println("Jabatan\t\t\t: Dosen Tetap");
        System.out.println("Tanggal Pensiun\t\t: " + getTglPensiun().format(format));
        System.out.println("Tunjangan\t\t: 2% x " + p.getYears() + " x " + formatGaji + " = " + formatTunjangan);
    }
}