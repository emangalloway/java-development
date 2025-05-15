package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("pam","122234",5000);
        Valuable account2 = new BankAccount("lou","222341",3500);

        account1.deposit(250);
        ((BankAccount) account2).deposit(20);

        System.out.println(account2);
        System.out.println(account1);
    }
}
