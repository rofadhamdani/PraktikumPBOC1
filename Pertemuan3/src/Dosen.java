/* Nama File   : Dosen.java
 * Deskripsi   : berisi atribut dan method dalam class Dosen
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117
 * Lab         : C1
 * Tanggal     : 5 Maret 2026
 */

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;
    private static int counterDosen = 0;
    
    public Dosen(){
        this("", "", "");
        counterDosen++;
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
        counterDosen++;
    }

    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public int getCounterDosen(){
        return counterDosen;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void printDosen(){
        System.out.println("NIP: " + nip + ", Nama: " + nama + ", Prodi: " + prodi);
    }

    public void printCounterDosen(){
        System.out.println(counterDosen);
    }

}
