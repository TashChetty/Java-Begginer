/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//
//1. Use the indexOf method to get the index for the space character (" ")
//     within custName.  Assign it to spaceIdx.
//2. Use the substring method and the spaceIdx to get the first name
//     portion of custName.  Assign it to firstName.  Print firstName.
package ex07_1_exercise;

/**
 *
 * @author ChettyNa
 */
public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;

        spaceIdx = custName.indexOf(" ");
        System.out.println(spaceIdx);
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
    }

}
