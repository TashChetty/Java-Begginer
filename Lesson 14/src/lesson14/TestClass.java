/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson14;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ChettyNa
 */
public class TestClass {

    public static void main(String[] args) {

        TestClass testClass = new TestClass();

        try {
            testClass.testCheckedException();
       
        
    }
    catch (IOException e){

  
            System.out.println(e);
    } 
        
    }
    

    public void testCheckedException() throws IOException {
        File testFile = new File("\testFile.txt");
        testFile.createNewFile();
        System.out.println("test file exists " + testFile.exists());
   
        
       
    }



}
