/* Nama File   : BangunDatar.java
 * Deskripsi   : berisi atribut dan method dalam class BangunDatar
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 12 Maret 2026
 */

public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    /*======================= KONSTRUKTOR ======================== */
    // membuat konstruktor default
    public BangunDatar(){
        counterBangunDatar++;
    }

    // membuat konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    /*======================= SELEKTOR ======================== */
    // mendapatkan nilai jumlah sisi
    public int getJmlSisi(){
        return jmlSisi;
    }

    // mendapatkan nilai warna
    public String getWarna(){
        return warna;
    }

    // mendapatkan nilai border
    public String getBorder(){
        return border;
    }

    /*======================= MUTATOR ======================== */
    // mengubah nilai jumlah sisi
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    // mengubah nilai warna
    public void setWarna(String warna){
        this.warna = warna;
    }

    // mengubah nilai border
    public void setBorder(String border){
        this.border = border;
    }

    /*======================= METHOD LAIN ======================== */
    // menampilkan informasi bangun datar
    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    // menampilkan jumlah objek bangun datar yang telah dibuat
    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}
