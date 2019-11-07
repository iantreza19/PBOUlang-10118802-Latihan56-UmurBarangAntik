/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IantReza
 */
public class Latihan56 {

    /**
     * @param args the command line arguments
     */
    static int umur;
    private static String name;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Radio radio = new Radio(umur);
        radio.setName("Radio AM");
        System.out.println("Nama barang antik : " + radio.getName());
        BarangAntik barang = new BarangAntik(umur);
        barang.tampilUmur();
    }
    
}
