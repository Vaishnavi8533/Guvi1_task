package guviclass;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        
        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        
        // Read the number entered by the user
        double number = scanner.nextDouble();
        
        // Close the Scanner object to prevent resource leak
        scanner.close();
        
        // Check if the number is negative, positive, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }  
    }
}
