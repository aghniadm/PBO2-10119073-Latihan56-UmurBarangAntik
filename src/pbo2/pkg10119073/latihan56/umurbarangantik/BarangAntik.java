package pbo2.pkg10119073.latihan56.umurbarangantik;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menampilkan nama dan umur barang antik
 * dengan konsep pewarisan class
 *
 */

public class BarangAntik {
    private int umur;
    
    public BarangAntik(int umur){
        this.umur = umur;
    }
    
    public void tampilUmur(){
        System.out.println("Umur barang antik ini adalah : "+umur+" tahun");
    }
}
