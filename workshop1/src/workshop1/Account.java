package workshop1;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0.0;
        dateCreated = new Date();
    }


    Account(int givenId, int givenBalance) {
        this();
        id = givenId;
        balance = givenBalance;


    }

    int getId() {
        return id;
    }

    void modifyId(int givenId) {
        id = givenId;
    }

    double getBalance() {
        return balance;
    }

    void modifyBalance(double givenBalance) {
        if (givenBalance < 0) {
            System.out.println("The balance cannot be in negative value");
        } else {
            balance = givenBalance;
        }
    }

    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    void modifyAnnualInterestRate(double givenAnnualInterestRate) {
        annualInterestRate = givenAnnualInterestRate;
    }

    Date getDateCreated() {
        return dateCreated;
    }

    double getMonthlyInterestRate() {
        return (annualInterestRate / 12);
    }

    double getMonthlyInterest() {
        double monthlyInterestRate = getMonthlyInterestRate();
        return (balance * monthlyInterestRate);
    }

    void withdraw(double amount) {

        balance = balance - amount;

    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    public String toString() {
        String balanceString = "The balance is : $" + getBalance() + "\n";
        String IdString = "The ID is :" + getId() ;
        String monthlyInterestString = "MonthlyInterest is: $" + getMonthlyInterest() + "\n";
        String dateString = "The account was created on:" + getDateCreated() + "\n";
        return balanceString + monthlyInterestString + dateString + IdString;
    }

    public static void main(String[] args) {
        Account obj = new Account(1122, 20000);

        obj.modifyAnnualInterestRate(0.045);
        obj.withdraw(2500);
        obj.deposit(3000);

        System.out.println(obj);
    }
}
