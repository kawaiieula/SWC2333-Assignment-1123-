
/**
 * program description:class driver
 *
 * programmer:Salman
 * Date:19 February 2024
 */
public class Flower
{
    // instance variables - replace the example below with your own
    private int quantity;
    private String name;
    private String colour;
    private double price;
    
    // Normal constructor with parameter
    public Flower(String name, int quantity , String colour , double price){
    this.name = name;
    this.quantity = quantity;
    this.colour = colour;
    this.price = price;
    }
    
    //Constructor without parameter
    public Flower(){
        this.name = "";
        this.quantity = 0;
        this.colour = "";
        this.price = 0;
    }
    
    //retrievers (accessors / getters) for each data member
    public String getName(){
        return name;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public String getColour(){
        return colour;
    }
    
    public double getPrice(){
        return price;
    }
    
    //Mutators (setters) that sets all data members
    public void setName(String name) {
        this.name = name;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    //toString() method that displays all information about the magazine object
    public String toString(){
        return "Name:" + name + "\nQuantity:" + quantity + "\nColours:" + colour + "\nPrice: " + price;
    }
    
}
