/**
 * File : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Nama      : Muhammad Rofad Hamdani / 24060124130117
 * Tanggal   : 19 April 2026
 * Lab       : C1
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}