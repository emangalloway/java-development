package com.pluralsight.finance;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;
    private double creditLimit;

    public CreditCard(String name, String accountNumber, double balance, double creditLimit) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.creditLimit = creditLimit;
    }
    public void charge(double amount){}

    public void pay(double amount){}


    @Override
    public double getValue() {
        return creditLimit;
    }
}
