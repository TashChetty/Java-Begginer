/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//1. Create a for loop that iterates through the items array,
//     displaying each element. Precede the list of elements with 
//     the message, "Items purchased: ".
package ex05_3_exercise;

/**
 *
 * @author ChettyNa
 */
public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message;

        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;

        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";

        message = custName + " wants to purchase " + items.length + " items.";
        System.out.println(message);


        System.out.println("Items purchased: ");

        for (String i : items) {
            System.out.println(i + ", ");
        }
    }
}
