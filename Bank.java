import java.util.*;
public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    // Create new account
    public void createAccount(String accountNumber, String name, double balance, double interestRate) {
        Account acc = new SavingAccount(accountNumber, name, balance, interestRate);
        accounts.add(acc);
        System.out.println("Account created successfully!");
    }

    // Find account by account number
    private Account findAccount(String accNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNumber)) {
                return acc;
            }
        }
        return null;
    }

    // Deposit
    public void deposit(String accNumber, double amount) {
        Account acc = findAccount(accNumber);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Withdraw
    public void withdraw(String accNumber, double amount) {
        Account acc = findAccount(accNumber);
        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Display all accounts
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found!");
            return;
        }
        for (Account acc : accounts) {
            System.out.println("-------------------------");
            acc.displayAccountDetails();
        }
    }

    // Delete account
    public void deleteAccount(String accNumber) {
        Account acc = findAccount(accNumber);
        if (acc != null) {
            accounts.remove(acc);
            System.out.println("Account deleted successfully!");
        } else {
            System.out.println("Account not found!");
        }
    }
}