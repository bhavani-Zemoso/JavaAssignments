package core_java.seven;

import assignment8.Bank;

public class Proj7_1_BankAccount {
    private String owner;
    private int balance;

    public Proj7_1_BankAccount(String owner)
    {
        this.owner = owner;
    }

    public Proj7_1_BankAccount(String owner, int balance)
    {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount)
    {
        if(amount <= 0)
            System.out.println("Enter an amount greater than 0");
        else {
            balance += amount;
            System.out.println("New balance : " + balance);
        }
    }

    public void withdraw(int amount)
    {
        if(amount <= 0)
            System.out.println("Enter a valid amount");
        else if(amount > balance)
            System.out.println("Insufficient balance");
        else
        {
            balance -= amount;
            System.out.println("New balance : " + balance);
        }
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }
}
