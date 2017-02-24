package com.gatto.tdd.course;

public class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public BankAccount() {
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int balance) {
        this.balance += balance;
    }

    public boolean withdraw(int balance) {
        if (balance > 1000) {
            return false;
        }
        this.balance -= balance;
        if (this.balance < 0) {
            this.balance -= 5;
        }
        return true;
    }

}
