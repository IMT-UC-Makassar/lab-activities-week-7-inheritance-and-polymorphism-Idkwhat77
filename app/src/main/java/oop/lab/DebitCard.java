package oop.lab;

public class DebitCard extends Card{

    public DebitCard(String number, String name) {
        super(number, name);
        //TODO Auto-generated constructor stub
    }
    
    public double getInterestRate(){
        return 0.0;
    }
}
