/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson.pkg12;

/**
 *
 * @author ChettyNa
 */
public class Shirt extends Clothing{
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
}
