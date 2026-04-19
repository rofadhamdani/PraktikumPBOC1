/**
 * File      : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 * Nama      : Muhammad Rofad Hamdani / 24060124130117
 * Tanggal   : 19 April 2026
 * Lab       : C1
 */

public class ExceptionOnArray{
    public static void main(String[] args){
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            // array hanya sampai index ke 3, jadi index ke 4 akan menyebabkan error
            arrayInteger[4] = 10;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally{
            System.out.println("Clean up code...");
        }
    }
}