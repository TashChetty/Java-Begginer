/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson5;

/**
 *
 * @author ChettyNa
 */
public class Practise5 {

    public static void main(String[] args) {
//        int attendance = 4;
//        boolean largeVenue;
//        
//        if (attendance>= 5){
//            largeVenue = false;
//        }
//        else{
//            largeVenue = true;
//        }
//        System.out.println(largeVenue);

//Arrays
//int[] ages = {14, 42, 92};
//        int[] ages = new int[3];
//        ages[0] = 19;
//        ages[1] = 42;
//        ages[2] = 92;
        // ages[3] = 52; // this will return anan error
//once array is assigned a length, you cannot change - eg capacity of 3 will take a max of 3
//String [] names = {"Mary", "Bob", "Carlos"};
//        String[] names = new String[3];
//        names[0] = "Mary";
//        names[1] = "Bob";
//        names[2] = "Carlos";
//
//        int[] ages = {25, 27, 42};
//        int myAge = ages[1];
//        int yourAge = ages[0];
//        System.out.println("My age is" + " " + myAge);
//        System.out.println(names[0]);
//        String[] names = {"George", "Mary", "Jack", "Jill"};
//
//        for (String n : names) {
//            System.out.println("Name is " + n);
//        }
        int passmark = 12;
        boolean passed = false;
        int[] scores = {4, 6, 2, 8, 12, 35, 9};
        for (int unitScore : scores) {
            if (unitScore >= 12) {
                passed = true;
                break;
            }
        }
        System.out.println("At least one passed " + passed);
    }

}
