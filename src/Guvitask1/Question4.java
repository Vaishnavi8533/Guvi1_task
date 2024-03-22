package Guvitask1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        
        // Prompt the user to enter three numbers
        System.out.println("Enter three numbers:");
        
        // Read the three numbers entered by the user
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        
        // Close the Scanner object to prevent resource leak
        scanner.close();
        
        // Find the smallest number among the three
        double smallest = num1; // Assume num1 is the smallest initially
        
        if (num2 < smallest) {
            smallest = num2; // Update smallest if num2 is smaller
        }
        
        if (num3 < smallest) {
            smallest = num3; // Update smallest if num3 is smaller
        }
        
        // Print the smallest number
        System.out.println("The smallest number is: " + smallest);
    }
}
