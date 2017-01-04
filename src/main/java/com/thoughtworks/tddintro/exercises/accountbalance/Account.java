package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    int balance;

    Account(int money){
        balance = money;
    }

    public Integer deposit(int amount){
        balance += amount;
        return balance;
    }
}
