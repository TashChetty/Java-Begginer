/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6b;

/**
 *
 * @author ChettyNa
 */
public class Shirt {

    public int id;
    public double price;
    public char colourCode;

    public static void main(String[] args) {
        // int counter = 10;

        Shirt myShirt = new Shirt();
        Shirt yourShirt = new Shirt();

        myShirt.id = 12;
        myShirt.price = 13.99;
        myShirt.colourCode = 'R';

        myShirt = yourShirt;

        yourShirt.id = 12;
        yourShirt.price = 13.99;
        yourShirt.colourCode = 'G';

        myShirt.colourCode = 'R';
        yourShirt.colourCode = 'G';
        System.out.println(myShirt.colourCode);
    }

}
