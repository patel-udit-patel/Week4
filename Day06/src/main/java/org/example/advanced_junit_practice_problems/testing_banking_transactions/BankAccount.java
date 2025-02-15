package org.example.advanced_junit_practice_problems.testing_banking_transactions;

public class BankAccount {
    private double balance;

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;  // If there are insufficient funds, return false
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

