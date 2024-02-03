/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex14_1_exercise;

/**
 *
 * @author ChettyNa
 */
public class ShoppingCart {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: " + addResult);

        // Add exception handling to catch ArithmeticException
        try {
            double divResult = calc.divide(15, 2);
            System.out.println("div result " + divResult);
        } catch (ArithmeticException e) {
            System.out.println("dealing with arithmetic exception");
        } 
        System.out.println("code continues");
    }
}