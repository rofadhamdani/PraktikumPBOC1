/* Nama File   : Mahasiswa.java
 * Deskripsi   : berisi atribut dan method dalam class Mahasiswa
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117
 * Lab         : C1
 * Tanggal     : 5 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    static int counterMhs = 0;
    
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = " ";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
        counterMhs++;
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
        counterMhs++;
    }

    public String getnim(){
        return nim;
    }

    public String getnama(){
        return nama;
    }

    public String getprodi(){
        return prodi;
    }

    public ArrayList<MataKuliah> getListMatkul(){
        return listMatkul;
    }

    public Dosen getdosenWali(){
        return dosenWali;
    }

    public Kendaraan getkendaraan(){
        return kendaraan;
    }

    public int getCounterMhs(){
        return counterMhs;
    }

    public void setnim(String nim){
        this.nim = nim;
    }

    public void setnama(String nama){
        this.nama = nama;
    }

    public void setprodi(String prodi){
        this.prodi = prodi;
    }

    public void setListMatkul(ArrayList<MataKuliah> listMatkul){
        this.listMatkul = listMatkul;
    }

    public void setdosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setkendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatKul (MataKuliah newMatKul){
        listMatkul.add(newMatKul);
    }

}
