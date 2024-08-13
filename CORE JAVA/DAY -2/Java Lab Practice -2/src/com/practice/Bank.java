package com.practice;

import java.util.ArrayList;

class Account {
    String accountNumber;
    String accountHolder;
    double balance;

    Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    void displayInfo() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}

public class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    void addAccount(Account account) {
        accounts.add(account);
    }

    void removeAccount(Account account) {
        accounts.remove(account);
    }

    void displayAccounts() {
        for (Account account : accounts) {
            account.displayInfo();
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("123456", "Mahizha", 5000);
        Account account2 = new Account("789012", "Jimtha", 3000);

        bank.addAccount(account1);
        bank.addAccount(account2);

        account1.deposit(2000);
        account2.withdraw(500);

        bank.displayAccounts();
    }
}
