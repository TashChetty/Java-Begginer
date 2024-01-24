/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//1. Declare a boolean, outOfStock, and initialize it to true.
//2. Use an if statement to test the value of quantity.  
//    If it is > 1, concatenate an 's' to message so that it indicates multiple items.
//3. Use an if | else statement that tests the value of outOfStock.
//    If true, let the user know the item is unavailable.
//    If false, print the message variable, then print the total cost with tax.
//4. Run with outOfStock = true and then again with outOfStock = false.
package ex05_1_exercise;

/**
 *
 * @author ChettyNa
 */
public class ShoppinCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

       
        double price = 25.99;
        int quantity = 5;
        double tax = 14.00;
        double total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        
        total = (price * quantity) * tax;

        
        boolean outOfStock = false;

        
        if (quantity > 1) {
            message = message + "s";
        }

       
        if (outOfStock) {
            System.out.println(itemDesc + " is out of stock.");
        } else {
            System.out.println(message);
            System.out.println("Total cost with tax: " + total);
        }

    }

}
