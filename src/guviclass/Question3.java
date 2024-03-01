package guviclass;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the number entered by the user
        int number = scanner.nextInt();
        
        // Close the Scanner object to prevent resource leak
        scanner.close();
        
        int reversedNumber = 0;
        
        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10; // Extract the last digit of the number
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }
        
        // Print the reversed number
        System.out.println("Reversed number: " + reversedNumber);
    }
}
