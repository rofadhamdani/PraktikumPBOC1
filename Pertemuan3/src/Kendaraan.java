/* Nama File   : Kendaraan.java
 * Deskripsi   : berisi atribut dan method dalam class Kendaraan
 * Pembuat     : Muhammad Rofad Hamdani / 24060124130117
 * Lab         : C1
 * Tanggal     : 5 Maret 2026
 */

public class Kendaraan {
    private String noPlat;
    private String jenis;
    private static int counterKendaraan = 0;
    
    public Kendaraan(){
        this("", "");
        counterKendaraan++;
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
        counterKendaraan++;
    }

    public String getnoPlat(){
        return noPlat;
    }

    public String getjenis(){
        return jenis;
    }

    public int getcounterKendaraan(){
        return counterKendaraan;
    }

    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setjenis(String jenis){
        this.jenis = jenis;
    }

    public void printKendaraan(){
        System.out.println("no Plat: " + noPlat + ", jenis: " + jenis);
    }

    public void printcounterKendaraan(){
        System.out.println(counterKendaraan);
    } 
}
