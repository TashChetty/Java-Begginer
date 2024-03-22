/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author ChettyNa
 */
public class Clothing implements Comparable<Clothing>{
    private String description;
    private String size = "M";
    private double price;
    public final static double MIN_PRICE =10.0;
    public final static double TAX_RATE =0.2;

    public Clothing(String description, double price, String aSize) {
        this.description = description;
        this.price = price;
        size = aSize;
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
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price + (price * TAX_RATE);
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = (price >MIN_PRICE) ? price: MIN_PRICE;
        
    } 
    @Override
    public String toString(){
        return getDescription() + "." + getSize()+ "," + getPrice();
    }
    @Override
    public int compareTo(Clothing c){
        return this.description.compareTo(c.description);
    }
}
