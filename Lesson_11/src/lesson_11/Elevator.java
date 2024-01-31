/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_11;

/**
 *
 * @author ChettyNa
 */
public class Elevator {
    

    public int currentFloor = 1;
    
    public void changeFloor(int targetFloor){
        while (currentFloor != targetFloor)
            if(currentFloor < targetFloor)
                goUp();
        else
                goDown();
        System.out.println("Reached estination, current floor is " + currentFloor);
    }

    private void goDown() {
        currentFloor--;
        System.out.println("moving down" + currentFloor);
    }

    private void goUp() {
        currentFloor++;
        System.out.println("moving up" + currentFloor);
}}