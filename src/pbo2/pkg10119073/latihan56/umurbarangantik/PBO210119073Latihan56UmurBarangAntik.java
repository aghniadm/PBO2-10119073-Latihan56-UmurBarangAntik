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

public class PBO210119073Latihan56UmurBarangAntik {

    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama barang Antik : "+radio.getName());
        radio.tampilUmur();
    }
    
}
