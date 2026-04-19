/**
 * File : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 * Nama      : Muhammad Rofad Hamdani / 24060124130117
 * Tanggal   : 19 April 2026
 * Lab       : C1
 */

public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){ //baris ini hanya akan dieksekusi jika angka tidak sama dengan 13 (yang merupakan angka sial)
            //melempar exception buatan sendiri jika angka yang dimasukkan adalah 13
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){ //baris ini akan dieksekusi karena pada blok try terdapat percobaan dengan angka 13 yang merupakan angka sial, jadi program akan menjalankan angka 10 dulu dan mencetak 10 bukan angka sial, kemudian melanjutkan dengan angka 13 dan blok pada catch dieksekusi, namun setelah itu percobaan dengan angka 12 tidak dilakukan karena blok catch sudah dieksekusi sebagai exception
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}