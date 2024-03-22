package Guvitask2;

public class Task3 {
    private double balance;

    // No-argument constructor
    public Task3() {
        this.balance = 0.0;
    }

    // Parameterized constructor
    public Task3(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Invalid initial balance. Balance set to 0.");
            this.balance = 0.0;
        }
    }

    // Method to deposit the amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    // Method to withdraw the amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount. Withdrawal failed.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Creating an account with default balance
    	Task3 account1 = new Task3();
        System.out.println("Account 1 created with default balance.");
        account1.displayBalance();

        // Creating an account with initial balance
        Task3 account2 = new Task3(8000.0);
        System.out.println("\nAccount 2 created with initial balance.");
        account2.displayBalance();

        // Depositing and withdrawing from account 2
        account2.deposit(900.0);
        account2.displayBalance();
        account2.withdraw(500.0);
        account2.displayBalance();
    }
}

