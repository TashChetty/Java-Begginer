/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//
//1. Instantiate the StringBuilder object (sb), initializing it
//     to firstName, using the StringBuilder constructor.
//2. Use the append method of the StringBuilder object to append the 
//     last name back onto the first name.  You can just use a String 
//     literal for the last name.  
//     Print the StringBuilder object and test your code.  
//     It should show the full name.
//
//Challenge:  Can you append the last name without using a String literal?
package ex07_2_exercise;

/**
 *
 * @author ChettyNa
 */
public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        StringBuilder sb;

        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);

        sb = new StringBuilder(firstName);
        //sb.append("Smith");
        sb.append(custName.substring(spaceIdx));
        System.out.println(sb);
    }
}
