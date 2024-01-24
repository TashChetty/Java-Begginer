/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//In the ShoppingCart class:
//1. Declare and instantiate 2 objects of type Item. Initialize only 
//     the descr field in each, using different values for each.
//2. Print the description for each item and run the code.
//3. (Optional) Above the code that prints the descriptions, 
//     assign item2 to item1.  Run it again.
package ex06_2_exercise;

/**
 *
 * @author ChettyNa
 */
public class ShoppingCart {

    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();

        item1.desc = "shirt";
        item2.desc = "shoes";

        System.out.println(item1.desc);
        System.out.println(item2.desc);

        System.out.println("Assign item2 to item1");
        item1 = item2;
        System.out.println(item1.desc);
        System.out.println(item2.desc);

    }
}
