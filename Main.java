package org.example;

import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {

        BankAcc acc1 = new BankAcc(5000.00);
        BankAcc acc2 = new BankAcc(6000.00);
        BankAcc acc3 = new BankAcc(7000.00);
        BankAcc acc4 = new BankAcc(8000.00);
        BankAcc acc5 = new BankAcc(9000.00);

        BankAcc.printBalance();
        System.out.println();

        double plus = acc1.deposit(6000.00);
        System.out.println(plus + " euros were added to the account acc1.");

        double minus = acc2.withdraw(7000.00);

        System.out.println(minus + " euros were removed from the account acc2.");

        acc3.transferMoney(acc4, 8000.00);

        System.out.println("\nFinally the status of your accounts is as follows:");
        int j = 1;
        for (int i = 0; i < BankAcc.allAccounts.size(); i++) {
            System.out.println("Acc" + j + ": " + BankAcc.allAccounts.get(i) + ";");
            j++;
        }
    }

}
