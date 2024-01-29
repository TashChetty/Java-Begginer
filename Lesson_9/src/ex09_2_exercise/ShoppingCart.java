/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//
//In the ShoppingCart class:
//2. Declare, instantiate, and initialize a new Customer object
//    by calling the custom constructor.  
//3. Test it by printing the customer object name 
//    (call getName method).


package ex09_2_exercise;

/**
 *
 * @author ChettyNa
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Customer cust = new Customer ("Natasha", "ssn");
            
        System.out.println("name is " + cust.getName());
    }
}
