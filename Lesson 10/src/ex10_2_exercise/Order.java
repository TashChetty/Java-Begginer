/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//In the Order class:
//1. Examine the existing code.
//2. Code the calcDiscount method to determine discount for each 
//     custType. 
//     - Nonprofits get a 10% discount if their order is > 900, 
//       otherwise it's 5%
//     - Private types get 7% if order is > 900, otherwise no discount.
//     - Corporate types get 8% if order < 500, otherwise they get 5%.
//     - Use nested and chained if statement
package ex10_2_exercise;

/**
 *
 * @author ChettyNa
 */
public class Order {
    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }
    
    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    
    public void calcDiscount() {
        if (custType == NONPROFIT){
            if (total > 900){
                discount = 10.00;
            }else discount = 5.00;
        }else if (custType == PRIVATE){
            if (total > 900){
                discount = 7.00;
            }else discount = 0;
        }else if (custType == CORP){
            if (total < 500){
                discount = 8.00;
            }else discount = 5.00;
        }        
    }
}

    

