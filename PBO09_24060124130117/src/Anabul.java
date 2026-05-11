/* Nama File   : Anabul.java
 * Deskripsi   : Program untuk membuat kelas Anabul
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 23 April 2026
 */

public class Anabul {
    // atribut
    protected String nama;
    protected String panggilan;

    // konstruktor
    public Anabul(String nama, String panggilan){
        this.nama = nama;
        this.panggilan = panggilan;
    }

    // selektor
    public String getNama(){
        return nama;
    }

    public String getPanggilan(){
        return panggilan;
    }

    // mutator
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setPanggilan(String panggilan){
        this.panggilan = panggilan;
    }

    // method
    public void gerak(){
        System.out.println("Anabul bergerak");
    }

    public void bersuara(){
        System.out.println("Anabul bersuara");
    }
}
