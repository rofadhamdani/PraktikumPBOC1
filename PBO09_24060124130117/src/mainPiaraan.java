/* Nama File   : mainPiaraan.java
 * Deskripsi   : Program untuk membuat aplikasi dari kelas Piaraan
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 7 Mei 2026
 */

public class mainPiaraan {
    public static void main(String[] args) {
        // membuat objek piaraan dan beberapa anabul
        Piaraan piaraan = new Piaraan();
        Kucing kucing1 = new Kucing("Kucing", "Miaw", 2.5);
        Anabul burung1 = new Burung("Burung", "Cwitt"); 
        Anggora anggora1 = new Anggora("Anggora", "Rawr", 3.0);
        Kembangtelon kembangtelon1 = new Kembangtelon("Kembangtelon", "Rewr", 0.5);
        Anjing anjing1 = new Anjing("Anjing", "GukGuk");

        // menambahkan beberapa anabul ke dalam koleksi
        piaraan.enqueueAnabul(kucing1);
        piaraan.enqueueAnabul(burung1);
        piaraan.enqueueAnabul(anggora1);
        piaraan.enqueueAnabul(kembangtelon1);
        piaraan.enqueueAnabul(anjing1);

        // menampilkan jumlah anabul dan daftar anabul
        System.out.println("Jumlah anabul: " + piaraan.getNbelm());
        piaraan.showAnabul();

        // memeriksa apakah anabul tertentu ada dalam koleksi
        Anabul anabulCari = anjing1;
        System.out.println("Anjing GukGuk ada dalam koleksi? " + (piaraan.isMember(anabulCari)? "Ada" : "Tidak Ada"));

        // mengambil anabul pertama dalam antrean
        Anabul anabulPertama = piaraan.getAnabul();
        if (anabulPertama != null){
            System.out.println("Anabul pertama dalam antrean: " + anabulPertama.getPanggilan());
        }

        // mengambil anabul pertama sekaligus mengeluarkannya dari antrean
        Anabul anabulDikeluarkan = piaraan.dequeueAnabul();
        if (anabulDikeluarkan != null){
            System.out.println("Anabul yang dikeluarkan dari antrean: " + anabulDikeluarkan.getPanggilan());
        }

        // menampilkan jumlah anabul setelah pengeluaran dan daftar anabul
        System.out.println("Jumlah anabul setelah pengeluaran: " + piaraan.getNbelm());
        piaraan.showAnabul();

        // menghitung banyak keluarga kucing dalam antrean
        System.out.println("Jumlah anabul dengan jenis 'Kucing': " + piaraan.countKucing());

        // menghitung bobot keluarga kucing dalam antrean
        System.out.println("Total bobot keluarga kucing dalam antrean: " + piaraan.bobotKucing());

        // menampilkan nama nama panggilan para anabul dalam antrean disertai dengan jenis objeknya
        piaraan.showJenisAnabul();
    }
}
