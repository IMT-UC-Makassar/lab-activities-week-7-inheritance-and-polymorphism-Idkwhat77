package oop.lab;

public class Card {
    
    private String cardNumber;
    private String cardHolder;

    public Card(String number, String name) {
        this.cardNumber = number;
        this.cardHolder = name;
    }
    
    public double getInterestRate(){
        return 0.0;
    }
}
