package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService{

    public SavingsAccount(String number, String name, double money) {
        super(number, name, money);
        //TODO Auto-generated constructor stub
    }

    public void calculateInterest() {
        deposit(getBalance() * 0.2);
    }

    public void transferFunds(double amount, String name) {
        withdraw(amount);
        System.out.println("this guy named " + name + " stole this amount from you : " + amount);
    }

    public void payBills(double amount) {
        withdraw(amount);
    }
}
