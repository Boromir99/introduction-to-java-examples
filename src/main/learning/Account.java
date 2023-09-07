package learning;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private double rate;
    private String name;
    private ArrayList<String> transactions = new ArrayList<>();

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public Account(String name, int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.name = name;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Getter method for id
    public int getId() {
        return id;
    }

    // Setter method for id
    public void Id(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void Balance(double Balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;

    }


    public double getMonthlyInterestRate() {
        return this.rate = annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return this.balance * getMonthlyInterestRate() / 100;
    }

    public double withdraw(double withdraw) {
        transactions.add("Withdraw of " + withdraw + " dolars");
        this.balance -= withdraw;
        return this.balance;
    }

    public double deposit(double deposit) {
        transactions.add("Deposit of " + deposit + " dolars");
        this.balance += deposit;
        return this.balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Account Information:\n" +
                "Name: " + name + "\n" +
                "Balance: $" + balance + "\n" +
                "Monthly Interest Rate: " + getMonthlyInterestRate() + "\n" +
                "Monthly Interest: $" + getMonthlyInterest() + "\n" +
                "Date Created: " + dateCreated + "\n" +
                transactions.toString();
    }
}
