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
        Customer c1 = new Customer("Pinky", 14);
       // c1.setName("Pinky");
        System.out.println("Welcome " + c1.getName() + "," + c1.getSize());
        System.out.println("Min Price" + Clothing.MIN_PRICE);
       

        //Ex 3.2
        double tax = 0.2;
        double total = 0;
        Clothing item1 = new Clothing("Blue Jacket",20.9,"M" );
        Clothing item2 = new Clothing("Orange T-shirt",10.5,"S");
        Clothing[]items = {item1, item2, new Clothing("Green Scarf",5.0,"S" ), new Clothing("Blue T-shirt",10.5,"S")}; 
        
        
        
        //System.out.println("Item1: " + item1.description + "," + item1.price + ","+ item1.size); //this is used for ex3.2
        //System.out.println("Item2: " + item2.description + "," + item2.price + "," + item2.size); //this is used for ex3.2
        //ex 4.1
        c1.setSize("S");
        int measurement = 8;
       c1.addItems(items);

       //c1.setSize(measurement); 
        System.out.println("Welcome " + c1.getName() + "," + c1.getSize()+ "." + c1.getTotalClothingCost());
        for(Clothing item : c1.getItems()){
       System.out.println("Items: " + item.getDescription());
            
           // System.out.println("Item: " + item.getDescription() + "," + item.getPrice() + ","+ item.getSize());
     
        }
         //   total = total + item.price;
   
         //   System.out.println("Item: " + item.description + "," + item.price + ","+ item.size);
        
        
       // total = ((item2.price * 2)+ item1.price)*(1 + tax); // this is used for ex3.2
        int average =0;
        int count = 0;
        for(Clothing item :c1.getItems()){
            if(item.getSize().equals("L")){
            count++;
            average+= item.getPrice();
        }
        }
        try{
        //average = (count ==0) ? 0: average/count; //avoid the exception with this line
        average = average/count;
           System.out.println("Average price " + average + "Count" + count);
        }catch(ArithmeticException e){
            System.out.println("Dont divide by 0");
        }


        }
    }


