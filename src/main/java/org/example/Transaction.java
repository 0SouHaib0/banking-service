package org.example;

import java.time.LocalDate;

public class Transaction {

    private int balance;
    private int amount;
    LocalDate date;

    public Transaction(int balance, int amount, LocalDate date) {
        this.balance = balance;
        this.amount = amount;
        this.date = date;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
