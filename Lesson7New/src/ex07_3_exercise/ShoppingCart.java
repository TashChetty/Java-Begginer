/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//1. Declare a long, using the L to indicate a long value.  Make it a 
//     very large number (in the billions).
//2. Declare and initialize a float and a char.
//3. Print the long variable with a suitable label.
//4. Assign the long to the int variable.  Correct the syntax error
//     by casting the long as an int.
//5. Print the int variable.  Note the change in value when you run it.
package ex07_3_exercise;

/**
 *
 * @author ChettyNa
 */
public class ShoppingCart {

    public static void main(String[] args) {
        int int1;

        long longNum = 200000000000000L;
        float f1oat = 2.2F;
        char ch = 'f';
        System.out.println("long number is   " + longNum);

        int1 = (int) longNum;
        System.out.println("Long after casting to int  " + int1);

    }
}
