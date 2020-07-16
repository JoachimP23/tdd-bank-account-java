package org.xpdojo.bank;

public class Account {

    protected int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

}
