/* Nama File   : Mahasiswa.java
 * Deskripsi   : berisi atribut dan method dalam class Mahasiswa
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 5 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    /*************** ATRIBUT ***************/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    static int counterMhs = 0;

    /*************** KONSTRUKTOR ***************/
    // konstruktor default untuk membuat objek mahasiswa dengan nilai awal kosong
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = " ";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // konstruktor untuk membuat objek mahasiswa dengan nilai nim, nama, dan prodi tertentu
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
        counterMhs++;
    }

    /*************** SELEKTOR ***************/
    // mengembalikan nilai nim mahasiswa
    public String getnim(){
        return nim;
    }

    // mengembalikan nilai nama mahasiswa
    public String getnama(){
        return nama;
    }

    // mengembalikan nilai program studi mahasiswa
    public String getprodi(){
        return prodi;
    }

    // mengembalikan daftar mata kuliah yang diambil mahasiswa
    public ArrayList<MataKuliah> getListMatkul(){
        return listMatkul;
    }

    // mengembalikan objek dosen wali mahasiswa
    public Dosen getdosenWali(){
        return dosenWali;
    }

    // mengembalikan objek kendaraan mahasiswa
    public Kendaraan getkendaraan(){
        return kendaraan;
    }

    // mengembalikan jumlah mahasiswa yang telah dibuat
    public static int getCounterMhs(){
        return counterMhs;
    }

    /*************** MUTATOR ***************/
    // mengubah nilai nim mahasiswa
    public void setnim(String nim){
        this.nim = nim;
    }

    // mengubah nilai nama mahasiswa
    public void setnama(String nama){
        this.nama = nama;
    }

    // mengubah nilai program studi mahasiswa
    public void setprodi(String prodi){
        this.prodi = prodi;
    }

    // mengubah daftar mata kuliah mahasiswa
    public void setListMatkul(ArrayList<MataKuliah> listMatkul){
        this.listMatkul = listMatkul;
    }

    // mengubah dosen wali mahasiswa
    public void setdosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    // mengubah kendaraan yang dimiliki mahasiswa
    public void setkendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    /*************** METHOD LAIN ***************/
    // menambahkan mata kuliah baru ke dalam daftar mata kuliah mahasiswa
    public void addMatKul (MataKuliah newMatKul){
        listMatkul.add(newMatKul);
    }

    // menghitung total SKS dari seluruh mata kuliah yang diambil mahasiswa
    public int getJumlahSKS(){
        int total = 0;
        for (int i=0; i<listMatkul.size(); i++){
            total += listMatkul.get(i).getSks();
        }
        return total;
    }

    // mengembalikan jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatKul(){
        return listMatkul.size();
    }

    // mencetak informasi dasar mahasiswa (nim, nama, dan prodi)
    public void printMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // mencetak informasi lengkap mahasiswa beserta daftar mata kuliah yang diambil
    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for (i=0; i<listMatkul.size(); i++){
            System.out.println(listMatkul.get(i).getNama());
        }
    }

    // mencetak jumlah mahasiswa yang telah dibuat
    public void printCounterMhs(){
        System.out.println(getCounterMhs());
    }

}