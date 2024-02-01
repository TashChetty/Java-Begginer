/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex12_2_exercise;

//In the Shirt class:
//1.  Override the display method and do the following:
//	- Call the superclass's display method.
//	- Print the size field and the colorCode field.  
//2.  Run the ShoppingCart class.  Do you see a different 
//      display than you did in the previous exercise?
/**
 *
 * @author ChettyNa
 */
public class Shirt extends Item{
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
    // Override the display method in Item to also show size and colorCode.
       // Avoid duplicating code.
    @Override
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+size);
        System.out.println("\tColorcode: "+ colorCode);
    } 
}
