/* Nama File   : mainTeman.java
 * Deskripsi   : Program untuk membuat aplikasi dari kelas dasar Teman
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 7 Mei 2026
 */

public class mainTeman {
    public static void main(String[] args) {
        // membuat objek teman dan menambahkan beberapa nama
        Teman teman = new Teman();
        teman.addNama("Rio");
        teman.addNama("Rionaldo");
        teman.addNama("Putri");
        teman.addNama("Rionaldo");
        // menampilkan jumlah teman dan daftar teman
        System.out.println("Jumlah teman: " + teman.getNbelm());
        teman.showTeman();

        // mengubah nama teman pada indeks tertentu
        teman.setNama(1, "Rendi");
        System.out.println("Teman ke-2 setelah diganti: " + teman.getNama(1));

        // memeriksa apakah nama tertentu ada dalam koleksi
        System.out.println("Rio teman atau bukan? " + (teman.isMember("Rio")? "Teman" : "Bukan Teman"));
        System.out.println("Salim teman atau bukan? " + (teman.isMember("Salim")? "Teman" : "Bukan Teman"));

        // menghapus nama dari koleksi dan menampilkan jumlah teman setelah penghapusan
        teman.delNama("Putri");
        System.out.println("Jumlah teman setelah menghapus Putri: " + teman.getNbelm());

        // mengganti nama tertentu dengan nama baru
        teman.gantiNama("Rio", "Rionaldo");
        System.out.println("Teman ke-1 setelah diganti: " + teman.getNama(0));

        teman.showTeman();

        // menghitung jumlah kemunculan nama tertentu dalam koleksi
        System.out.println("Jumlah nama 'Rionaldo': " + teman.countNama("Rionaldo"));
    }
}
