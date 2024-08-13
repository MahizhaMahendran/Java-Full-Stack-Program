package com.assignment;

class BankAccounts {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class SavingsAccount extends BankAccounts {
    
    void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
        } else {
            System.out.println("Cannot withdraw: Balance would fall below $100");
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.deposit(200);
        sa.withdraw(150);  
    }
}
