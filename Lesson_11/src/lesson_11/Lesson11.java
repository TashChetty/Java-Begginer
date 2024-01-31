/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson_11;

//import java.time.LocalDate;
import java.util.ArrayList;

//import java.time.LocalDateTime;
//import java.time.chrono.JapaneseDate;
//import java.time.format.DateTimeFormatter;
//import java.time.format.FormatStyle;
/**
 *
 * @author ChettyNa
 */
public class Lesson11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        LocalDate myDate = LocalDate.now();
//        System.out.println("local date is " + myDate);
//
//
//JapaneseDate jdate = JapaneseDate.from(myDate);
//        System.out.println("Japanese date:  " + jdate);
//        
//     LocalDate myDate2 = myDate.minusMonths(15);
//        System.out.println("local date  is  " + myDate2);  
//        
//        LocalDate myDate3 = myDate.plusDays(8);
//        System.out.println("local date  is  " + myDate3);  
//     
//        LocalDateTime today = LocalDateTime.now();
//        System.out.println("Todays date time (no formatting): " + today);
//        
//        String sdate = 
//                today.format(DateTimeFormatter.ISO_DATE_TIME);
//                System.out.println("Date in ISO_DATE_TIME format: " + sdate);
//                
//                String fdate = 
//                        today.format(DateTimeFormatter.ofLocalizedDateTime (FormatStyle.MEDIUM));
//                System.out.println("Formatted with MEDIUM FormatStyle: " +fdate);

//int [][] yearlySales;
//type [][]array_identifier;
//
//yearlySales = new int [5][4];
//array_identifier = new type [number_of_arrays] [length];
//int[][] yearlySales = new int [5][4];
//yearlySales [0][0] = 1000;
//yearlySales [0][1] = 1500;
//yearlySales [0][2] = 1800;
//yearlySales [1][0] = 1000;
//yearlySales [3][3] = 2000;
//yearlySales [3][1] = 5000;
//yearlySales [1][2] = 10000;
//        System.out.println(yearlySales[1][2]);
//       System.out.println("/*");
//       int counter = 0;
//       while (counter <3){
//           System.out.println(" *");
//           counter++;
//           //counter--;
//       }
//       System.out.println("*/");
//for(int i = 1; 1<5; i++){
//    System.out.println("i= " +i + ", ");
//}
//int i = 0;
//while(i<3){
//    System.out.println(" *");
//    i++;
//}
//for (int num =0; num <3; num++){
//    System.out.println(" *");
//}
//   }
//String[]names = {"Jack", "Jill", "Moses", "Sarah"};
//for (String name: names){
//    System.out.println(name);
//}
//for (int idx =0; idx < names.length; idx++){
//    System.out.println(names[idx]);
//int i=0;
//do{
//    System.out.println(i);
//    i++;
//} while(i<10){
//factorial(5);
        //   }
//    static void factorial(int target) {
//        int save = target;
//        int fact = 1;
//        do {
//            fact *= target--;
//
//        } while (target > 0);
//        System.out.println("Factorial for  " + save + ": " + fact);
//   
//        String[] names = {"Jack", "Jill", "Moses", "Sarah", "no name"};
//        for (String name : names) {
//
//            if (name.equals("no name")) {
//
//                continue;
//            }
//            System.out.println(names);
//
//        }
//int height =4, width =10;
//
//for(int row = 0; row< height; row++){
//    for(int col =0; col<width; col++){
//        System.out.print("@");
//    }
//    System.out.println();
//}
//        String name = "Lenny";
//        String guess = "";
//        int attempts = 0;
//        while (!guess.equalsIgnoreCase(name)) {
//            guess = "";
//            while (guess.length() < name.length()) {
//                char asciiChar = (char) (Math.random() * 26 + 97);
//                guess += asciiChar;
//            }
//            attempts++;
//        }
//        System.out.println(name + "found after " + attempts + " tries");
//int sales[][] = new int[3][4];
//        sales = initArray(sales);
//        for (int y = 0; y < 3; y++) {
//            for (int q = 0; q < 4; q++) {
//                System.out.print("\tQ" + (q + 1) + " " + sales[y][y]);
//            }
//            System.out.println();
//        }
//    }
//
//    static int[][] initArray(int[][] sales) {
//        for (int y = 0; y < 3; y++) {
//            for (int q = 0; q < 4; q++) {
//                sales[y][q] = (int) Math.floor(Math.random() + 2000);
//
//            }
//            
//        }
//        return sales;
        ArrayList<String> names;
        names = new ArrayList();

        names.add("Jamie");
        names.add("Gustav");
        names.add("Alisa");
        names.add("Jose");
        names.add(2, "Prashant");
        System.out.println(names);
        
        names.remove(0);
        System.out.println(names);
        
        names.remove(names.size() - 1);
        System.out.println(names);
       
        names.remove("Gustav");
        System.out.println(names);
    }
}
