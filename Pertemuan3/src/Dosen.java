/* Nama File   : Dosen.java
 * Deskripsi   : berisi atribut dan method dalam class Dosen
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 5 Maret 2026
 */

public class Dosen {
    /*************** ATRIBUT ***************/
    private String nip;
    private String nama;
    private String prodi;
    private static int counterDosen = 0;

    /*************** KONSTRUKTOR ***************/
    //konstruktor default untuk membuat objek dosen dengan nilai kosong
    public Dosen(){
        this("", "", "");
    }

    //konstruktor untuk membuat objek dosen dengan nip, nama, dan prodi tertentu
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
        counterDosen++;
    }

    /*************** SELEKTOR ***************/
    //mengembalikan nilai NIP dosen
    public String getNip(){
        return nip;
    }

    //mengembalikan nama dosen
    public String getNama(){
        return nama;
    }

    //mengembalikan program studi dosen
    public String getProdi(){
        return prodi;
    }

    //mengembalikan jumlah objek dosen yang telah dibuat
    public static int getCounterDosen(){
        return counterDosen;
    }

    /*************** MUTATOR ***************/
    //mengubah nilai NIP dosen
    public void setNip(String nip){
        this.nip = nip;
    }

    //mengubah nama dosen
    public void setNama(String nama){
        this.nama = nama;
    }

    //mengubah program studi dosen
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    /*************** METHOD LAIN ***************/
    //mencetak informasi dosen (NIP, Nama, dan Prodi)
    public void printDosen(){
        System.out.println("NIP: " + nip + ", Nama: " + nama + ", Prodi: " + prodi);
    }

    //mencetak jumlah objek dosen yang telah dibuat
    public void printCounterDosen(){
        System.out.println(counterDosen);
    }
}