package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! banking service app test ");
        //test depost and withdraw
        Account account = new Account();

        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        account.printStatement();    }
}