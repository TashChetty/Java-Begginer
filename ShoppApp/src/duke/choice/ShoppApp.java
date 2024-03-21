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
        c1.setName("Pinky");
        System.out.println("Welcome " + c1.getName() + "," + c1.getSize());

       

        //Ex 3.2
        double tax = 0.2;
        double total = 0;
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing[]items = {item1, item2, new Clothing(), new Clothing()}; // ex4.2
        
        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");
        
        item2.setDescription("Orange T-shirt");
        item2.setPrice(10.5) ;
        item2.setSize("S");
        
        items[2].setDescription("Green Scarf");
        items[2].setPrice(5.0) ;
        items[2].setSize("S");
        
        items[3].setDescription("Blue T-shirt");
        items[3].setPrice(10.5) ;
        items[3].setSize("S");
        
        //System.out.println("Item1: " + item1.description + "," + item1.price + ","+ item1.size); //this is used for ex3.2
        //System.out.println("Item2: " + item2.description + "," + item2.price + "," + item2.size); //this is used for ex3.2
        //ex 4.1
        c1.setSize("S");
        int measurement = 8;
       c1.addItems(items);

       c1.setSize(measurement); 
        System.out.println("Welcome " + c1.getName() + "," + c1.getSize()+ "." + c1.getTotalClothingCost());
        for(Clothing item : c1.getItems()){
       System.out.println("Items: " + item.getDescription());
            
           // System.out.println("Item: " + item.getDescription() + "," + item.getPrice() + ","+ item.getSize());
     
        }
         //   total = total + item.price;
   
         //   System.out.println("Item: " + item.description + "," + item.price + ","+ item.size);
        }
        
       // total = ((item2.price * 2)+ item1.price)*(1 + tax); // this is used for ex3.2
        


    }


