/* Nama File   : MataKuliah.java
 * Deskripsi   : berisi atribut dan method dalam class MataKuliah
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117
 * Lab         : C1
 * Tanggal     : 5 Maret 2026
 */

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;
    private static int counterMatKul = 0;
    
    public MataKuliah(){
        this("", "", 0);
        counterMatKul++;
    }

    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
        counterMatKul++;
    }

    public String getidMatKul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public int getCounterMatKul(){
        return counterMatKul;
    }

    public void setidMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

    public void printMatKul(){
        System.out.println("id MatKul: " + idMatKul + ", Nama: " + nama + ", SKS: " + sks);
    }

    public void printCounterMatKul(){
        System.out.println(counterMatKul);
    }

}
