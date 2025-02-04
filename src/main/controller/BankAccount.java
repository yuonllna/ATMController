package main.controller;

public class BankAccount {
    private String accountNumber;
    private int balance;
    private String ownerCardNumber;

    public BankAccount(String accountNumber, int initialBalance, String ownerCardNumber) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.ownerCardNumber = ownerCardNumber;
    }
    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        balance += amount;
    }
    public boolean withdraw(int amount){
        if (balance < amount)
            return false;
        balance -= amount;
        return true;
    }
    public String getOwnerCardNumber() {
        return ownerCardNumber;
    }
}
