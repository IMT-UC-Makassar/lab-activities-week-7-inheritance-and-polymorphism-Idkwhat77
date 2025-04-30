package oop.lab;

public abstract class BankAccount {
    
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String number, String name, double money) {
        this.accountNumber = number;
        this.accountHolder = name;
        this.balance = money;
    }

    public void deposit(double money) {
        balance += money;
    }

    public void withdraw(double money) {
        if (money > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= money;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void calculateInterest();
}
