
/**
 * program description:Java program to manage their flower inventory efficiently
 *
 * programmer:BUJAL
 * Date:4 February 2024
 */
import java.util.Scanner;
public class Flowershop
{
   public static void main(String[] args) {
       
       int size = 3;
       Flower[] flowerArr = new Flower[size];
       Scanner scanner = new Scanner(System.in);
       
       for (int i = 0; i< size; i++) {
           System.out.print("Enter Name: ");
           String name = scanner.nextLine();
           
           System.out.print("Enter Quantity: ");
           int quantity = scanner.nextInt();
           scanner.nextLine();
           System.out.print("Enter Colour: ");
           String colour = scanner.nextLine();
           
           System.out.print("\nEnter price: ");
           double price = scanner.nextDouble();
           scanner.nextLine();
           
           flowerArr[i] = new Flower(name,quantity,colour,price);
           
       }
       System.out.println("\n\n---------Flower Details-------------");
       for(int i= 0; i< size; i++){
           System.out.println(flowerArr[i].toString());
           
       }
       
       //calculate and display the total values
       
       double total = 0.0;
       for(int i=0; i < size; i++){
           double price = flowerArr[i].getPrice();
           int quantity = flowerArr[i].getQuantity();
           
           total = total + (price * quantity);
       }
       
       System.out.println("\nTotal Value: " + total);

       
       System.out.println("\n Enter the flower name you want to search");
       String searchName = scanner.nextLine();
       
       while (!searchName.equalsIgnoreCase("X")){ 
           int foundInd = 0;
           boolean found = false;
           
           while(!found && foundInd<size){
               if(flowerArr[foundInd].getName().equalsIgnoreCase(searchName)){
                   found = true;
                   foundInd = 0;
               }
               foundInd++;
           }
           
           if(found == true){
                System.out.println("\nBelow is the flower details:");
                System.out.print(flowerArr[foundInd].toString());
            }else{
                System.out.println("\nFlower not found.");
            }            
            System.out.print("\nEnter the flower name that you want to search (X to exit search function): ");
            searchName = scanner.nextLine();
        }
        
       //restock
       System.out.print("\nEnter the name of the flower to restock: ");
        searchName = scanner.nextLine();

        for (int i = 0; i < flowerArr.length; i++) {
            if (flowerArr[i].getName().equalsIgnoreCase(searchName)) {
                System.out.print("Enter the quantity to restock : ");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                int newQuantity = quantity + flowerArr[i].getQuantity();
                flowerArr[i].setQuantity(newQuantity);
                System.out.println("\n---------Flower Inventory Restock!---------");
                System.out.println(flowerArr[i].toString());
            }
    }
  }  
}