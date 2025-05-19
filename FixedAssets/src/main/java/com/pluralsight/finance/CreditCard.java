package com.pluralsight.finance;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balanceOwed;

    public CreditCard(String name, String accountNumber, double openingBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balanceOwed = openingBalance;
    }


    public void charge(double amount) {
      //  if (amount > 0) balanceOwed += amount;
    }


    public void pay(double amount) {
      //  if (amount > 0) balanceOwed -= amount;
    }


    @Override
    public double getValue() {
        return -balanceOwed;
    }
}
