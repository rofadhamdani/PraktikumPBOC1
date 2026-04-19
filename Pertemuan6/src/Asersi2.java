/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi,yang akan menolak input
 *             jari-jari lingkaran yang bernilai nol
 * Nama      : Muhammad Rofad Hamdani / 24060124130117
 * Tanggal   : 19 April 2026
 * Lab       : C1
 */

//class Lingkaran
class Lingkaran{
    private double jariJari;
    
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        //assert untuk memastikan bahwa jari-jari lingkaran tidak boleh bernilai nol (harus menuliskan sintaks '-ea' di terminal)
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        //tetap dijalankan jika tidak menulis '-ea'
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/*
    setiap menulis asersi, untuk mengaktifkannya perlu menulis sintaks -ea di terminal,
    jika tidak menulisnya maka program akan mengabaikan asersi.
    pada program Asersi2 jika tidak menulis -ea pada terminal program akan
    mengeksekusi perintah sampai menghitung keliling,
    padahal seharusnya jika jika jari jari kurang dari sama dengan nol maka akan keluar error.
    jadi lebih baik menggunakan kondisional if else untuk pengalaman pengguna agar
    tidak harus menuliskan -ea
*/