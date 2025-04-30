package oop.lab;

public class CreditCard extends Card{

    public CreditCard(String number, String name) {
        super(number, name);
        //TODO Auto-generated constructor stub
    }
    
    public double getInterestRate(){
        return 15.0;
    }
}
