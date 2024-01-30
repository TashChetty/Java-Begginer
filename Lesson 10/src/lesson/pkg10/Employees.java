/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson.pkg10;

/**
 *
 * @author ChettyNa
 */
public class Employees {

    public String name1 = "Fred Smith";
    public String name2 = "fred smith";

    public void areNamesEqual() {
        // if (name1.equals(name2)) {  // testing equality between string variables
       if (name1.equalsIgnoreCase(name2)) { //
            // if (name1== name2) {
            System.out.println("Same name");
        } else {
            System.out.println("Different name");
        }
    }
    public static void main(String[] args) {
        Employees emps = new Employees();
            emps.areNamesEqual();
    }
}
