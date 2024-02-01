/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex12_3_exercise;

//import ex12_3_exercise.*;

/**
 *
 * @author ChettyNa
 */
public class ShoppingCart {

    public static void main(String[] args) {
        // declare and instantiate a Shirt object using an Item reference type
        Item myShirt = new Shirt(300.99, 'M', 'B');
     //   myShirt = null;
//        item myShirt = new Trousers(300.99, 'M', 'B');

        // call the display method on the object, then the getColor method
        myShirt.display();
        if (myShirt instanceof Shirt) {
            String color = ((Shirt) myShirt).getColor();
            System.out.println("Color is " + color);
        } else {
            System.out.println("myShirt does not contain a Shirt.");
        }
    }
}
