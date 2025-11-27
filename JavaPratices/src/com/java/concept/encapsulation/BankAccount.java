package com.java.concept.encapsulation;

/**
 * This class was created to demonstrate the concept of encapsulation.
 *
 * What is Encapsulation?
 * Encapsulation binds variables and methods into a single unit. It also restricts
 * direct access to variables for data protection, allowing controlled access
 * through methods such as getters and setters.
 */
public class BankAccount {

    private double balance;

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("After withdraw / balance amount:" + balance);
    }

    public void depoist(double amount) {
        balance = balance + amount;
        System.out.println("Depoit sucessfully / balance amount:" + balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.depoist(1000);
        bankAccount.withdraw(500);

    }
}

