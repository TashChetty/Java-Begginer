/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ChettyNa
 */
public class TestLambda {
    public static void main(String[] args) {

    String[]nums ={"one", "two", "three"};
        List<String>myList = Arrays.asList(nums);
        System.out.println("myList");
        ArrayList<String>myArrayList = new ArrayList(myList);
        myList.replaceAll(s->s.toUpperCase()); //short version
        System.out.println(myList);
        myArrayList.replaceAll(x->x.toUpperCase());
        System.out.println(myArrayList);
        
        //urinary operator - returns same value you pass into it
        myList.replaceAll((String s)->{return s.toUpperCase();}); // long version
        System.out.println(myList);
        
        //predicate
        myArrayList.removeIf(s ->s.equals("TWO"));
        System.out.println(myArrayList);
        
        
}
}