package org.example;

import java.util.ArrayList;

public class BankAcc {
    private double balance;
    private final double LIMIT = 5000.00;
    static ArrayList<BankAcc> allAccounts = new ArrayList<BankAcc>();
    public BankAcc(double balance) {
        this.balance = balance;
        allAccounts.add(this);
    }
    double deposit(double amount) {
        if (amount > LIMIT) {
            System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit: " + amount + ".");
        } else {
            this.balance += amount;
        }
        return amount;
    }

    double withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("There is not enough founds.");
        } else {
            this.balance -= amount;
        }
        return amount;
    }

    void transferMoney(BankAcc accTo, double amount) {
        if (this.balance == 0) {
            System.out.println("Sorry, your account is empty...");
            return;
        }
        if (this.balance < amount) {
            System.out.println("Transfer canceled. You are trying to transfer " + amount + " units, but only " + this.balance + " are available.");
            return;
        }
        accTo.balance += amount;
        this.balance -= amount;
    }

    // This method however I left as static
    static void printBalance() {
        for (BankAcc acc : BankAcc.allAccounts) {
            acc.deposit(100.00);
            System.out.println("After topping up your account with 100.00 euros, your account balance is: " + acc.balance);
            acc.withdraw(50.00);
            System.out.println("After withdrawing 50.00 euros from the account, your account balance is: " + acc.balance);
        }
    }
}
