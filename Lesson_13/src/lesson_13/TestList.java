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
public class TestList {
    public static void main(String[] args) {
        String[]nums ={"one", "twp", "three"};
        List<String>myList = Arrays.asList(nums);
        System.out.println("myList");
        ArrayList<String>myArrayList = new ArrayList(myList);
        
    }
  
    
}
