/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson14;

/**
 *
 * @author ChettyNa
 */
public class Utils {
    public static void main(String[] args) {
        System.out.println("in main method - start"); 
        try{
        doThis();} catch (Exception e){
        System.out.println(e);
    } 
    }
    static void doThis (){
        System.out.println("in doThis()");
        try{
        doThat();
        }catch (Exception e){
        System.out.println(e);
    } 
    }
    static void doThat(){
        System.out.println("in doThat()");
        try{
            throw new Exception();
        }catch (Exception e){
            System.out.println(e);
        }
        }
        
    }

