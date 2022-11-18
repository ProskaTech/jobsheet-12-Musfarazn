/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan6;

/**
 *
 * @author user
 */
public class EncapsulationBuah {
     //Data memberss of class EncapsulationBuah
    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;
    //declaration of cunstructor
    public EncapsulationBuah(String namaBuah, String hargaBuah, String warnaBuah)
    {
        this.namaBuah = namaBuah;
        this.hargaBuah = hargaBuah;
        this.warnaBuah = warnaBuah;
    }
    //Declaring Setter for all fields
    public void setName(String namaBuah){
        this.namaBuah = namaBuah;
    }
    public void setPrice(String hargaBuah) {
        this.hargaBuah = hargaBuah;
    }
    public void setColor(String warnaBuah) {
        this.warnaBuah = warnaBuah;
    }
    //Declaring getter for all fields
    public String getName()
    {
        return namaBuah;
    }
    public String getPrice()
    {
        return hargaBuah;
    }
    public String getColor()
    {
        return warnaBuah;
    }
}
