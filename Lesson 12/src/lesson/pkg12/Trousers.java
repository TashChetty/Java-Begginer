/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson.pkg12;

/**
 *
 * @author ChettyNa
 */
public class Trousers extends Clothing {
   private char gender;
    private char fit;

    public Trousers(int itemID, String desc, double price, char colorCode, char fit, char gender) {
        super(itemID, desc, price, colorCode);
        this.gender = gender;
        this.fit = fit;
    }
   
//
    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
  public void setGender(char gender) {
      this.gender = gender;
      
   }
  
    public void display(){
        super.display();
       
      //  System.out.println(getFit() + "fit is ");
        System.out.println("gender is " + gender);
    }

    void getFit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @param fit the fit to set
     */
    public void setFit(char fit) {
        this.fit = fit;
    }
}
