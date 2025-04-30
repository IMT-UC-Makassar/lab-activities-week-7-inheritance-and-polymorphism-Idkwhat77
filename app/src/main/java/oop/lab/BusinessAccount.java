package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService {

    public BusinessAccount(String number, String name, double money) {
        super(number, name, money);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Money get");
    }

    @Override
    public String checkLoanStatus() {
        return "Pending";
    }

    @Override
    public void transferFunds(double amount, String name) {
        withdraw(amount);
        System.out.println("this guy named " + name + " stole this amount from you : " + amount);
    }

    @Override
    public void payBills(double amount) {
        withdraw(amount);
    }

    @Override
    public void calculateInterest() {
        deposit(getBalance() * 0.0003);
    }
    
    
}
