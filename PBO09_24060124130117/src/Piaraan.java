/* Nama File   : Piaraan.java
 * Deskripsi   : Program untuk membuat kelas dasar Piaraan untuk kelas koleksi
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 7 Mei 2026
 */

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    // atribut
    private int nbelm;
    private Queue<Anabul> Lanabul;

    // konstruktor
    public Piaraan() {
        this.nbelm = 0;
        this.Lanabul = new LinkedList<>();
    }

    // method
    // mengembalikan jumlah elemen dalam koleksi
    public int getNbelm(){
        return nbelm;
    }

    // menambah elemen akhir
    public void enqueueAnabul(Anabul anabul){
        Lanabul.add(anabul);
        nbelm++;
    }

    // memeriksa apakah nama tertentu ada dalam koleksi
    public boolean isMember(Anabul anabul){
        return Lanabul.contains(anabul);
    }

    // mengambil data anabul pertama dalam antrean
    public Anabul getAnabul(){
        if (!Lanabul.isEmpty()){
            return Lanabul.peek();
        }
        return null;
    }

    // mengambil anabul pertama sekaligus mengeluarkannya dari antrean
    public Anabul dequeueAnabul(){
        if (!Lanabul.isEmpty()){
            nbelm--;
            return Lanabul.poll();
        }
        return null;
    }

    // menampilkan nama nama panggilan anabul
    public void showAnabul(){
        System.out.println("List Anabul:");
        for (int i = 0; i < nbelm; i++){
            Anabul anabul = ((LinkedList<Anabul>) Lanabul).get(i);
            System.out.println((i+1) + ". " + anabul.getPanggilan());
        }
    }

    // menghitung banyak keluarga kucing dalam antrean
    public int countKucing(){
        int count = 0;
        for (Anabul anabul : Lanabul){
            if (anabul instanceof Kucing){
                count++;
            }
        }
        return count;
    }
    
    // menghitung bobot keluarga kucing dalam antrean
    public double bobotKucing(){
        double totalBobot = 0;
        for (Anabul anabul : Lanabul){
            if (anabul instanceof Kucing){
                totalBobot += ((Kucing) anabul).getBobot();
            }
        }
        return totalBobot;
    }

    // menampilkan nama nama panggilan para anabul dalam antrean disertai dengan jenis objeknya
    public void showJenisAnabul(){
        System.out.println("List Anabul dengan Jenis:");
        for (int i = 0; i < nbelm; i++){
            Anabul anabul = ((LinkedList<Anabul>) Lanabul).get(i);
            System.out.println((i+1) + ". " + anabul.getPanggilan() + " (" + anabul.getClass().getName() + ")");
        }
    }
}