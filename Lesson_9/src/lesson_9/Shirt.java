/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_9;

/**
 *
 * @author ChettyNa
 */
public class Shirt {

    private int shirtID = 0;
    private String description = "description required";
    private char colorCode = 'U';
    private double price = 0.0;
    
   // public Shirt(){
//}
   // }

    public Shirt(char colorCode, String desc, double price) {
        setColorCode(colorCode);
        setDescription(desc);
        
        setPrice(price);
    }

    Shirt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public char getColorCode() {
        return colorCode;

    }

    public void setColorCode(char colorCode) {
        if (colorCode == 'R') {
            this.colorCode = colorCode;
            return;
        }
        if (colorCode == 'G') {
            return;
        }
        if (colorCode == 'B') {
            return;
        }
        System.out.println(colorCode + " is an invalid color code! use R, G or B");
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
}