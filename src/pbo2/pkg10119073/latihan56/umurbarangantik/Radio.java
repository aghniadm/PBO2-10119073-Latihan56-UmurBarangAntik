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

public class Radio extends BarangAntik{
    private String name;
    
    public Radio(int umur){
        super(umur);
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
}
