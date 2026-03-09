/* Nama File   : MataKuliah.java
 * Deskripsi   : berisi atribut dan method dalam class MataKuliah
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 5 Maret 2026
 */

public class MataKuliah {
    /*************** ATRIBUT ***************/
    private String idMatKul;
    private String nama;
    private int sks;
    private static int counterMatKul = 0;

    /*************** KONSTRUKTOR ***************/
    //konstruktor default untuk membuat objek mata kuliah dengan nilai kosong
    public MataKuliah(){
        this("", "", 0);
    }

    //konstruktor untuk membuat objek mata kuliah dengan id, nama, dan sks tertentu
    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
        counterMatKul++;
    }

    /*************** SELEKTOR ***************/
    //mengembalikan id mata kuliah
    public String getidMatKul(){
        return idMatKul;
    }

    //mengembalikan nama mata kuliah
    public String getNama(){
        return nama;
    }

    //mengembalikan jumlah SKS mata kuliah
    public int getSks(){
        return sks;
    }

    //mengembalikan jumlah objek MataKuliah yang telah dibuat
    public static int getCounterMatKul(){
        return counterMatKul;
    }

    /*************** MUTATOR ***************/
    //mengubah id mata kuliah
    public void setidMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    //mengubah nama mata kuliah
    public void setNama(String nama){
        this.nama = nama;
    }

    //mengubah jumlah SKS mata kuliah
    public void setSks(int sks){
        this.sks = sks;
    }

    /*************** METHOD LAIN ***************/
    //mencetak informasi mata kuliah (id, nama, dan jumlah SKS)
    public void printMatKul(){
        System.out.println("id MatKul: " + idMatKul + ", Nama: " + nama + ", SKS: " + sks);
    }

    //mencetak jumlah objek MataKuliah yang telah dibuat
    public void printCounterMatKul(){
        System.out.println(counterMatKul);
    }
}