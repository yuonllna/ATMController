package main.controller;

public class User {
    private String cardNumber;
    private int pin;

    public User(String cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }
    public boolean validatePIN(int inputPIN){
        if (this.pin == inputPIN)
            return true;
        return false;
    }
    public String getCardNumber() {
        return cardNumber;
    }
}
