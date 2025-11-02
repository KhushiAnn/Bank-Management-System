import java.util.*;

// Main class (Entry point)
public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        int choice;
        do {
            System.out.println("\n=== BANK MANAGEMENT SYSTEM ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display All Accounts");
            System.out.println("5. Delete Account");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNum = sc.next();
                    System.out.print("Enter Account Holder Name: ");
                    sc.nextLine(); // consume leftover newline
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();
                    System.out.print("Enter Interest Rate (%): ");
                    double rate = sc.nextDouble();
                    bank.createAccount(accNum, name, balance, rate);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accNum = sc.next();
                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmount = sc.nextDouble();
                    bank.deposit(accNum, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNum = sc.next();
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    bank.withdraw(accNum, withdrawAmount);
                    break;

                case 4:
                    bank.displayAllAccounts();
                    break;

                case 5:
                    System.out.print("Enter Account Number to Delete: ");
                    accNum = sc.next();
                    bank.deleteAccount(accNum);
                    break;

                case 6:
                    System.out.println("Exiting system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}