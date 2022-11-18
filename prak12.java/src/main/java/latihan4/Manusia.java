/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan4;

/**
 *
 * @author user
 */
public class Manusia {
    public static void main(String args[]){
        //object induk tidak bisa dibuat disini
        
        //buat object anak umur 1 tahun baru
        AnakUmur1Tahun a1 = new AnakUmur1Tahun();
        
        //panggil method anak umur 1 tahun
        a1.makan();
        a1.minum();
        a1.namaAyahKu();
        System.out.println();
    }
}
