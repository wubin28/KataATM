package com.wubinben.kata.kataatm;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-8-16
 * Time: 下午6:15
 * To change this template use File | Settings | File Templates.
 */
public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public static Account newInstance(int balance) {
        return new Account(balance);
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
