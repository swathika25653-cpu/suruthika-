package com.p1;
import java.util.Scanner;
public class coffeeshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Coffee - Rs. 15");
        System.out.println("2. Tea - Rs. 10");
        System.out.println("3. Cold Coffee - Rs. 25");
        System.out.println("4. Milkshake - Rs. 50");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        
        double price;
        switch(choice){
            case 1 :
            	price=15.0;
            	break;
            case 2 : 
            	price=10.0;
            	break;
            case 3 :
            	price=25.0;
            	break;
            case 4 :
            	price=50.0;
            	break;
            default:
                System.out.println("Invalid choice");
                return;
            }

        if (price > 0) {
            double totalCost = price * quantity;
            System.out.println("Total cost: Rs. " + totalCost);
        }
        scanner.close();
    }
}
        