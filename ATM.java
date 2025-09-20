import java.util.Scanner;

class ATM {
    private double balance;

    // Constructor
    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited ₹" + amount);
            checkBalance();
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn ₹" + amount);
            checkBalance();
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class ATM_Machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(5000); // initial balance ₹5000

        while (true) {
            System.out.println("\n====== ATM MENU ======");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    atm.deposit(dep);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double wd = sc.nextDouble();
                    atm.withdraw(wd);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
