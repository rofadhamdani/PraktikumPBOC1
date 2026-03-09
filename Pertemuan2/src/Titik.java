/* Nama File   : Titik.java
 * Deskripsi   : berisi atribut dan method dalam class Titik
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 26 Februari 2026
 */

public class Titik {
    /*************** ATRIBUT ***************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*************** KONSTRUKTOR ***************/
    //konstruktor untuk membuat titik dengan nilai (0,0)
    Titik(){
        this(0,0);
    }

    //konstruktor untuk membuat titik dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    /*************** SELEKTOR ***************/
    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengembalikan jumlah objek Titik yang telah dibuat
    static int getCounterTitik(){
        return counterTitik;
    }

    /*************** MUTATOR ***************/
    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    /*************** METHOD LAIN ***************/
    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //mencetak jumlah objek titik
    void printCounterTitik(){
        System.out.println(this.counterTitik);
    }

    //menentukan kuadran posisi titik pada bidang kartesius
    int getKuadran(){
        if (absis>0 && ordinat>0){
            return 1;
        }
        else if (absis<0 && ordinat>0){
            return 2;
        }
        else if (absis<0 && ordinat<0){
            return 3;
        }
        else{
            return 4;
        }
    }

    //menghitung jarak titik terhadap titik pusat (0,0)
    double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    //menghitung jarak antara titik ini dengan titik lain
    double getJarak(Titik T){
        return Math.sqrt(Math.pow(absis-T.absis, 2) + Math.pow(ordinat-T.ordinat, 2));
    }

    //merefleksikan titik terhadap sumbu X
    void refleksiX(){
        ordinat = -ordinat;
    }

    //merefleksikan titik terhadap sumbu Y
    void refleksiY(){
        absis = -absis;
    }

    //mengembalikan titik hasil refleksi terhadap sumbu X
    Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    //mengembalikan titik hasil refleksi terhadap sumbu Y
    Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }

} //end class Titik