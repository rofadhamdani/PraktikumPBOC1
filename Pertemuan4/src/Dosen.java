/* Nama File   : Dosen.java
 * Deskripsi   : berisi atribut dan method dalam class Dosen
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 25 Maret 2026
 */

import java.time.LocalDate;

public class Dosen extends Pegawai {
    protected String fakultas;

    /*======================= KONSTRUKTOR ======================== */
    // membuat konstruktor default
    public Dosen(){
    }

    // membuat konstruktor dengan parameter
    public Dosen(String fakultas, String NIP, String nama, LocalDate tanggalLahir, LocalDate TMTbekerja, double gajiPokok){
        super(NIP, nama, tanggalLahir, TMTbekerja, gajiPokok);
        this.fakultas = fakultas;
    }

    /*======================= SELEKTOR ======================== */
    // mendapatkan Fakultas Dosen
    public String getFakultas(){
        return fakultas;
    }

    /*======================= MUTATOR ======================== */
    // mengubah nilai Fakultas Dosen
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    /*======================= METHOD LAIN ======================== */
    @Override
    // menampilkan informasi detail Dosen
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas\t\t: Fakultas " + fakultas);
    }
}