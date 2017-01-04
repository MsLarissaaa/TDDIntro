package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    Account(int money){
        balance = money;
    }

    Integer deposit(int amount){
        balance += amount;
        return balance;
    }

    Integer withdrawal(int amount){
        if(amount < balance){
            balance -= amount;
        }
        return balance;
    }
}
