package com.pluralsight.finance;


public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double startingBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = startingBalance;
    }

    public void deposit(double amount) {
     //   if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
      //  if (amount > 0 && amount <= balance) balance -= amount;
    }

    @Override
    public double getValue() {
        return balance;
    }

}

