package Guvitask1;

//Import Scanner class from java.util package
import java.util.Scanner; 

public class Question1 {
    public static void main(String[] args) {
    	// Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in); 
        // insisting  user to enter starting number
        System.out.print("Enter the starting number: "); 
        
        //Read starting number from user input
        int start = scanner.nextInt(); // 
        
        // insisting user to enter ending number
        System.out.print("Enter the ending number: ");
        
     // Read ending number from user input
        int end = scanner.nextInt(); 
        
     // Closing the Scanner object to prevent resource leak
        scanner.close(); 
        
     // Printing a message to point the range of numbers to be printed
        System.out.println("Numbers from " + start + " to " + end + ":");
        
        
        // Start the for loop with index variable i initialing to start the number
        // Continue looping until i reaches or exceeds the ending number
        // Increment i by 1 in each iteration
        for (int i = start; i <= end; i++) {
            
            System.out.println(i); // Print the current value of i
        }
    }
}
