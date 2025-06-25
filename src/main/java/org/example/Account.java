package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Account implements AccountService{
    private int balance = 0 ;
    private List<Transaction> transactions= new ArrayList<>();

    public void isAmountValid(int amount){
        if(amount<0){
            throw new IllegalArgumentException("Amount is negative");
        }
    }
    @Override
    public void deposit(int amount) {
        isAmountValid(amount);
        balance+=amount;
        transactions.add(new Transaction(balance,amount, LocalDate.now()));
    }

    @Override
    public void withdraw(int amount) {
        isAmountValid(amount);
        if(amount > balance)
            throw new IllegalArgumentException("Insufficient balance");
        balance -= amount;
        transactions.add(new Transaction(balance,-amount,LocalDate.now()));
    }

    @Override
    public void printStatement() {
    System.out.println("DATE         || AMOUNT      || BALANCE");
    List<Transaction> helpList=new ArrayList<>(transactions);
        Collections.reverse(helpList);

        for(Transaction t : helpList){
            System.out.printf(" %s  || %d  || %d\n",t.getDate(),t.getAmount(),t.getBalance());
        }
    }


}
