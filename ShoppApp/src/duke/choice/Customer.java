/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author ChettyNa
 */
public class Customer {
    private String name;
    private String size;
    private Clothing[]items;

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }
    
    
    public void addItems(Clothing [] someItems){
        items = someItems;
    }
    public Clothing[] getItems(){
        return items;
    }
    double total = 0.0;
    public double getTotalClothingCost(){
        for(Clothing item : items){
         //if(c1.getSize().equals(item.getSize())){
             total = total + item.getPrice();
            
          //  System.out.println("Item: " + item.getDescription() + "," + item.getPrice() + ","+ item.getSize());
           //  total = total + total * tax; //4.3
           // if(total>15){break;}
        }
       // }
        return total;
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
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }
    public void setSize(int measurement) {
         switch (measurement) {
            case 1, 2, 3:
                setSize("S");
                break;
            case 4, 5, 6:
                setSize("M");
                break;
            case 7, 8, 9:
                
                setSize("L");
                break;
            default:
                
                setSize("XL");
        }
    }

}

