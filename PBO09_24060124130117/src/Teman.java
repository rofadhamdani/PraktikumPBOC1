/* Nama File   : Teman.java
 * Deskripsi   : Program untuk membuat kelas dasar Teman untuk kelas koleksi
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 7 Mei 2026
 */

import java.util.ArrayList;
import java.util.List;

public class Teman {
    // atribut
    private int nbelm;
    private List<String> Lnama;

    // konstruktor
    public Teman() {
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }

    // method
    // mengembalikan jumlah elemen dalam koleksi
    public int getNbelm(){
        return nbelm;
    }

    // mengembalikan nama pada indeks tertentu
    public String getNama(int indeks){
        if (indeks>=0 && indeks<nbelm) {
            return Lnama.get(indeks);
        }
        return null;
    }

    // mengubah nama pada indeks tertentu
    public void setNama(int indeks, String nama){
        if (indeks>=0 && indeks<nbelm){
            Lnama.set(indeks, nama);
        }
    }

    // menambahkan nama ke dalam koleksi
    public void addNama(String Nama){
        Lnama.add(Nama);
        nbelm++;
    }

    // menghapus nama dari koleksi
    public void delNama(String Nama){
        if (Lnama.remove(Nama)){
            nbelm--;
        }
    }

    // memeriksa apakah nama tertentu ada dalam koleksi
    public boolean isMember(String Name){
        return Lnama.contains(Name);
    }

    // mengganti nama tertentu dengan nama baru
    public void gantiNama(String Nama, String namaBaru){
        int indeks = Lnama.indexOf(Nama);
        if (indeks != -1){
            Lnama.set(indeks, namaBaru);
        }
    }

    // menghitung jumlah kemunculan nama tertentu dalam koleksi
    public int countNama(String Nama){
        int count = 0;
        for (String name : Lnama){
            if (name.equals(Nama)){
                count++;
            }
        }
        return count;
    }

    // menampilkan semua nama list teman dalam koleksi
    public void showTeman(){
        System.out.println("List Teman:");
        for (int i = 0; i < nbelm; i++){
            System.out.println((i+1) + ". " + Lnama.get(i));
        }
    }
}