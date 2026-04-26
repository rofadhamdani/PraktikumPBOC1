/* Nama File   : Mahasiswa.java
 * Deskripsi   : Program untuk membuat kelas Mahasiswa dengan beberapa konstruktor dan metode untuk mengubah program studi
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117 / C1
 * Tanggal     : 23 April 2026
 */

public class Mahasiswa {
    // atribut
    private String NIM;
    private String Nama;
    private String Programstudi;

    // c. konstruktor tanpa parameter
    public Mahasiswa(){
        this.NIM = "-999";
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    // d. konstruktor 3 parameter
    public Mahasiswa(String NIM, String Nama, String Programstudi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    // e. konstruktor cloning
    public Mahasiswa(Mahasiswa m){
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.Programstudi = m.Programstudi;
    }

    // mengambil nilai NIM
    public String getNIM() {
        return NIM;
    }

    // mengambil nilai Nama
    public String getNama() {
        return Nama;
    }

    // mengambil nilai Program Studi
    public String getProgramstudi() {
        return Programstudi;
    }

    // mengubah nilai NIM
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    // mengubah nilai Nama
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    // mengubah nilai Program Studi tanpa parameter
    public void setProgramStudi() {
        this.Programstudi = "Kosong";
    }

    // mengubah nilai Program Studi dengan satu parameter String
    public void setProgramStudi(String Programstudi) {
        this.Programstudi = Programstudi;
    }

    // mengubah nilai Program Studi dengan satu parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa m) {
        this.Programstudi = m.Programstudi;
    }   

    // menampilkan informasi mahasiswa
    public void printInfo(){
        System.out.println("NIM : " + this.NIM);
        System.out.println("Nama : " + this.Nama);
        System.out.println("Program Studi : " + this.Programstudi + "\n\n");
    }

}
