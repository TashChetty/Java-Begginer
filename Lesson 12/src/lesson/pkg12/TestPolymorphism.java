/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson.pkg12;

/**
 *
 * @author ChettyNa
 */
public class TestPolymorphism {
    public static void main(String[] args) {
        Clothing c1 = new Shirt(1,"shirts",300.99, 'R', 'M');
        Clothing c2 = new Trousers(1,"shirts",300.99, 'R', 'M', 'F');
        
        c1.display();
        System.out.println();
        c2.display();
        System.out.println();
        
        if(c1 instanceof Shirt shirt){
            shirt.getFit();
        }
         if(c2 instanceof Trousers){
            ((Trousers)c1).getFit();
        }
    }
}
