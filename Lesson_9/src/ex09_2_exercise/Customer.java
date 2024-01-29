/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//In the Customer class:
//1. Add a custom constructor that initializes the fields.
package ex09_2_exercise;

/**
 *
 * @author ChettyNa
 */
public class Customer {
    private String name;
    private String ssn;

    public Customer(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ssn
     */
    public String getSsn() {
        return ssn;
    }
    
}
