package guviclass;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        
        // Prompt the user to enter the purchase amount
        System.out.print("Enter the purchase amount: ");
        
        // Read the purchase amount entered by the user
        double purchaseAmount = scanner.nextDouble();
        
        // Close the Scanner object to prevent resource leak
        scanner.close();
        
        double discount = 0.0; // Initialize discount to 0
        
        // Determine the discount based on the purchase amount
        if (purchaseAmount >= 500 && purchaseAmount < 1000) {
           discount = 0.10; // 10% discount for purchase amount between 500 and 1000
        } else if (purchaseAmount >= 1000) {
            discount = 0.20; // 20% discount for purchase amount greater than 1000
        }
        
        double payableAmount = purchaseAmount - (purchaseAmount * discount); // Calculate the payable amount after discount
        
        // Print the payable amount
        System.out.println("Final payable amount after applying discount: $" + payableAmount);
    }
}


