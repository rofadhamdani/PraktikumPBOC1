/* Nama File   : Kendaraan.java
 * Deskripsi   : berisi atribut dan method dalam class Kendaraan
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 5 Maret 2026
 */

public class Kendaraan {
    /*************** ATRIBUT ***************/
    private String noPlat;
    private String jenis;
    private static int counterKendaraan = 0;

    /*************** KONSTRUKTOR ***************/
    //konstruktor default untuk membuat objek kendaraan dengan nilai kosong
    public Kendaraan(){
        this("", "");
    }

    //konstruktor untuk membuat objek kendaraan dengan nomor plat dan jenis tertentu
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
        counterKendaraan++;
    }

    /*************** SELEKTOR ***************/
    //mengembalikan nomor plat kendaraan
    public String getnoPlat(){
        return noPlat;
    }

    //mengembalikan jenis kendaraan
    public String getjenis(){
        return jenis;
    }

    //mengembalikan jumlah objek kendaraan yang telah dibuat
    public static int getcounterKendaraan(){
        return counterKendaraan;
    }

    /*************** MUTATOR ***************/
    //mengubah nomor plat kendaraan
    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    //mengubah jenis kendaraan
    public void setjenis(String jenis){
        this.jenis = jenis;
    }

    /*************** METHOD LAIN ***************/
    //mencetak informasi kendaraan (nomor plat dan jenis)
    public void printKendaraan(){
        System.out.println("no Plat: " + noPlat + ", jenis: " + jenis);
    }

    //mencetak jumlah objek kendaraan yang telah dibuat
    public void printcounterKendaraan(){
        System.out.println(counterKendaraan);
    }
}