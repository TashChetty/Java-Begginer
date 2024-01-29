/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex08_1_exercise;

/**
 *
 * @author ChettyNa
 */
public class ShoppingCart {
    public static void main(String[] args){
        Item item1 = new Item();
        
        

        if (item1.setColor('B')){
            System.out.println("Item1.color = "+item1.color);
        }else System.out.println("Invalid color");
    }
}
