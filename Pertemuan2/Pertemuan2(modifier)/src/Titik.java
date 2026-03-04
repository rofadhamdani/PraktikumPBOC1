/* Nama File   : Titik.java
 * Deskripsi   : berisi atribut dan method dalam class Titik
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117
 * Tanggal     : 26 Februari 2026
 */

public class Titik {
    /***************ATRIBUT***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /***************METHOD***************/
    //konstruktor untuk membuat titik (0,0)
    public Titik(){
        this(0,0);
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public void printCounterTitik(){
        System.out.println(this.counterTitik);
    }

    public int getKuadran(){
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

    public double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    public double getJarak(Titik T){
        return Math.sqrt(Math.pow(absis-T.absis, 2) + Math.pow(ordinat-T.ordinat, 2));
    }

    public void refleksiX(){
        ordinat = -ordinat;
    }

    public void refleksiY(){
        absis = -absis;
    }

    public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }

} //end class Titik