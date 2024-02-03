/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_13;

/**
 *
 * @author ChettyNa
 */
public class Shirt extends Clothing implements Printable,Returnable{
//    private int neckSize;
//    public int getNeckSize(){
//        return neckSize;
//    }
//            public void setNecksize(int nSize){
//                this.neckSize = nSize;
//            }


//Example 2
   private char fit = 'U';

   public Shirt(int itemID, String desc, double price, char colorCode, char fit) {
      super(itemID, desc, price, colorCode);
      this.fit = fit;
  } 
    public char getFit(){
        return fit;
    } 
    public void setFit(char fit){
        this.fit = fit;
    }
    public void display(){
        super.display();
        System.out.println("fit is" + fit);
                
    } 
    @Override
    public String toString(){
        return "\nItem is is " +getItemID() + "\nDescription is " + getDesc();
    }

    @Override
    public void print() {
        System.out.println("print");
    } 
    @Override
    public void doReturn() {
        System.out.println("return");    
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
