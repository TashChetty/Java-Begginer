/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_13;

/**
 *
 * @author ChettyNa
 */
public class TestInterface {
    public static void main(String[] args) {
//        Shirt myShirt = new Shirt(1,"shirts",300.99, 'R', 'M');
//                myShirt.print();
//                 myShirt.doReturn();
    Clothing c1 = new Trousers(1,"shirts",300.99, 'R', 'M', 'F');
    Trousers t1 = new Trousers(1,"shirts",300.99, 'R', 'M', 'F');
    Returnable r1 = new Trousers(1,"shirts",300.99, 'R', 'M', 'F');

t1.getFit();
t1.getItemID();
t1.doReturn();

c1.getColorCode();
if(c1 instanceof Trousers){
((Trousers)c1).getFit();
}
if (c1 instanceof Returnable){
            ((Returnable)c1).doReturn();
}
r1.doReturn();
//((Trousers)r1).getColorCode();
((Clothing)r1).getColorCode();
((Trousers)r1).getFit();
    }
}
