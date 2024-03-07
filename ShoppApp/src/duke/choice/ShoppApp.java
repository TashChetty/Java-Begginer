/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

/**
 *
 * @author ChettyNa
 */
public class ShoppApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ex2
        System.out.println("Welcome to Duke's choice Shop");

        //Ex3.1
        Customer c1 = new Customer();
        c1.name = "Pinky";
        System.out.println("Welcome " + c1.name);

        //ex 4.1
        c1.size = "S";
        int measurement = 3;
        System.out.println(c1.name + "'s " + "size is " + c1.size);

        switch (measurement) {
            case 1, 2, 3:
                c1.size = "S";
                break;
            case 4, 5, 6:
                c1.size = "M";
                break;
            case 7, 8, 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }

        //Ex 3.2
        double tax = 0.2;
        double total;
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing[]items = {item1, item2}; // ex4.2
        
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";
        
        item2.description = "Orange T-shirt";
        item2.price =10.5 ;
        item2.size = "S";
        
        
        System.out.println("Item1: " + item1.description + "," + item1.price + ","+ item1.size);
        System.out.println("Item2: " + item2.description + "," + item2.price + "," + item2.size);
        
        total = ((item2.price * 2)+ item1.price)*(1 + tax);
        System.out.println("The total price incl tax is: "+total);


    }

}
