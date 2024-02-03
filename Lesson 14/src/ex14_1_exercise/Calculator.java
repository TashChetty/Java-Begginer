/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//
//In the Calculator class:
//1.  Change the divide method signature so that it throws 
//      an ArithmeticException.
//
//In the ShoppingCart class:
//2.  Surround the code that calls the divide method
//      with a try / catch block.  Handle the exception 
//      object by printing it to the console.
//3.  Run the ShoppingCart to view the outcome.
package ex14_1_exercise;

/**
 *
 * @author ChettyNa
 */
public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    // This method could throw an ArithmeticException
    public double divide(int x, int y){
        return x / y;
    }
}

