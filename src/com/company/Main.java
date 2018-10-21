package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    public Account(){}
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate  = annualInterestRate;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setDateCreated(Date dateCreated){
        this.dateCreated = dateCreated;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return (annualInterestRate/100)/12;
    }
    public double getMonthlyInterest() {
        return (balance * getMonthlyInterestRate());
    }
    public void withdraw(double money){
        balance = (balance+getMonthlyInterest()) - money;
    }
    public void deposit(double addBlance){
        balance += addBlance;
    }
}
public class Main {

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        Account acc = new Account(1122,20000);
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.println("Balance now:"+acc.getBalance()+"\nMonthlyInterest taken:"+acc.getMonthlyInterest());
        System.out.println("Time created:"+acc.getDateCreated());

    }
}
