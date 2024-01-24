/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Exercise 5-2
//
//1. Declare a String array and initialize it with 4 elements.
//     Each element represents a different item description ("Shirt", for instance).
//2. Change message to show how many items the customer wants to purchase 
//     (Use the length property of the items array).
//3. Print just one element of the items array.  
//     What happens if you use index number 4?
package ex05_2_exercise;

/**
 *
 * @author ChettyNa
 */
public class ShoppingCart {

    public static void main(String[] args) {

        String custName = "Mary";
        String message;
        //String [] items = {"Shirt", "Shoes","Belt","Dress"};
        String[] items = new String[4];
        items[0] = "Shirt";
        items[1] = "Shoes";
        items[2] = "Belt";
        items[3] = "Dress";

        message = custName + " wants to purchase " + items.length + " items.";
        System.out.println(message);
        System.out.println(items[3]);
        // System.out.println(items[4]);

    }
}
