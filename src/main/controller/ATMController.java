package main.controller;

import java.util.HashMap;
import java.util.Map;

public class ATMController {
    private Map<String, User> users;
    private Map<String, BankAccount> accounts;
    private User currentUser;
    private String currentAccount;
    private boolean isAuthenticated;

    public ATMController() {
        this.users = new HashMap<>();
        this.accounts = new HashMap<>();
        this.currentUser = null;
        this.currentAccount = null;
        this.isAuthenticated = false;
    }

    public void addUser(String cardNumber, User user){
        users.put(cardNumber, user);
    }
    public void addAccount(String accountNumber, BankAccount account){
        accounts.put(accountNumber, account);
    }
    public boolean insertCard(String cardNumber){
        if (users.containsKey(cardNumber)){
            currentUser = users.get(cardNumber);
            return true;
        } else {
            return false;
        }
    }

    public boolean enterPIN(int pin){
        if (currentUser == null){
            return false;
        }
        if (currentUser.validatePIN(pin)){
            isAuthenticated = true;
            return true;
        }
        return false;
    }

    public boolean selectAccount(String accountNumber){
        if (isAuthenticated) {
            if(accounts.containsKey(accountNumber) &&
                    accounts.get(accountNumber).getOwnerCardNumber().equals(currentUser.getCardNumber())) {
                currentAccount = accountNumber;
                return true;
            }
        }
        return false;
    }
    public int checkBalance(){
        if (!isAuthenticated  || currentAccount == null || !accounts.containsKey(currentAccount)){
            return -1;
        }
        return accounts.get(currentAccount).getBalance();
    }
    public boolean deposit(int amount){
        if (!isAuthenticated  || currentAccount == null || !accounts.containsKey(currentAccount)){
            return false;
        }
        accounts.get(currentAccount).deposit(amount);
        return true;
    }
    public boolean withdraw(int amount){
        if (!isAuthenticated  || currentAccount == null || !accounts.containsKey(currentAccount)){
            return false;
        }
        return accounts.get(currentAccount).withdraw(amount);

    }
}
