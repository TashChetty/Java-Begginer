/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//In the ShoppingCart class:
//3. Examine the code.  This class needs no modification.
//4. Run the ShoppingCart to test the order.calcDiscount method.
package ex10_2_exercise;

/**
 *
 * @author ChettyNa
 */
public class ShoppingCart {
     public static void main(String args[]){
        Order order = new Order("Rick Wilson", 910.00, "VA", Order.NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}
