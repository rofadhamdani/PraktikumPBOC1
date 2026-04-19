/*
 * File      : Asersi1.java
 * Deskripsi : Program untuk menunjukkan asersi
 * Nama      : Muhammad Rofad Hamdani / 24060124130117
 * Tanggal   : 19 April 2026
 * Lab       : C1
 */

public class Asersi1{
    public static void main(String[] args){
        int x=0;
        if (x>0){
            System.out.println("x bilangan positif");
        }
        else{
            //assert untuk memastikan bahwa x bilangan negatif (harus menuliskan sintaks '-ea' di terminal)
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}