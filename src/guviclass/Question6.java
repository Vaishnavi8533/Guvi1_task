package guviclass;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt(); // Read the number of rows
        scanner.close(); // Close the Scanner object to prevent resource leak
        
        // Loop for each row
        for (int i = 0; i < n; i++) {
            // Loop for each column
            for (int j = n; j > 0; j--) {
                if (j > n - i) {
                    System.out.print(j); // Print decreasing numbers
                } else {
                    System.out.print(n - i); // Print the fixed number
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
