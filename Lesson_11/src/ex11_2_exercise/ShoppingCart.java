/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//1. Parse the args array to populate name and age.  
//     If the args array contains fewer than 2 elements, print
//       a message, telling the user that 2 arguments are required.
//     Remember that the age argument will have to be 
//       converted to an int. 
//       Hint: Use a static method of Integer class to convert it.
//
//2. Print the name and age values with a suitable label.
package ex11_2_exercise;

/**
 *
 * @author ChettyNa
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String name;
        int age;

        
        if (args.length < 2) {
                System.out.println("2 args required");
        } else {
                name = args[0];
                age = Integer.parseInt(args[1]);
                System.out.println("Name = "+name+", Age = "+age);
        }
    }
}

