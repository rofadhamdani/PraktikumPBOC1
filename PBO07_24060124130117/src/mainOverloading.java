/* Nama File   : mainOverloading.java
 * Deskripsi   : Program untuk melakukan aplikasi pada kelas Mahasiswa dengan overloading
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 23 April 2026
 */

public class mainOverloading {
    public static void main(String[] args){
        // c. konstruktor tanpa parameter
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Mahasiswa 1 : ");
        m1.printInfo();

        // d. konstruktor dengan tiga parameter
        Mahasiswa m2 = new Mahasiswa("24060124130117", "Rofad", "Informatika");
        System.out.println("Mahasiswa 2 : ");
        m2.printInfo();

        // e. konstruktor cloning
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("Mahasiswa 3 : ");
        m3.printInfo();

        // mengubah program studi m1 tanpa parameter
        m1.setProgramStudi();
        System.out.println("Mahasiswa 1 setelah diubah program studi : ");
        m1.printInfo();

        // mengubah program studi m1 dengan parameter
        m1.setProgramStudi("Teknik Informatika");
        System.out.println("Mahasiswa 1 setelah diubah program studi : ");
        m1.printInfo(); 

        // mengubah program studi m1 dengan parameter objek Mahasiswa lain
        m1.setProgramStudi(m2);
        System.out.println("Mahasiswa 1 setelah diubah program studi : ");
        m1.printInfo();
    }
}