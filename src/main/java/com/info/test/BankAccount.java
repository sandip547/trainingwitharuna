package com.info.test;

import java.util.Scanner;

public class BankAccount {
    int accountNumber;
    double balance;


     public BankAccount(int accountNumber,int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount){

        this.balance += amount; //balance = balance + amount   1500   =   blance = 1500 + 400 = 1900
        System.out.println("your new balance is: " + this.balance);
    }
}
