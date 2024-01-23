/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04_2_exercise;

/**
 *
 * @author ChettyNa
 */
public class ShoppingCart {

    public static void main(String[] args) {
//1. Declare and initialize numeric fields. Include price and tax (double), 
//     quantity (int). Also declare a double called total, but do not initialize it.
//2. Change the message variable to include quantity 
//      (example: "Mary Smith wants to purchase 1 Shirt.")
//3. Calculate total by multiplying price * quantity * tax.
//4. Print a message showing the total cost. 
//      (example:  "Total cost with tax is: 25.78.") 

        String custName = "Mary Smith";
        String itemDesc = "shirts";
        double price = 25.99;
        double tax = 14.00;
        int quantity = 3;
        double total;

        String message = custName + " " + "wants to buy" + " " + quantity + " " + itemDesc;

        System.out.println(message);

        total = price * quantity * tax;

        System.out.println("The total cost is" + " " + total);

    }
}
