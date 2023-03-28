package assignment.Feb8;

public class BankAccount {
    
    // attributes
    public double balance;

    // Constructor
    public BankAccount(double balance){
        this.balance = balance;
    }

    // Methods required
    public void deposit(double amount){
        balance += amount;
        System.out.println("Balance = " + balance);
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Your remain balance after the withdraw is " + balance);
        }
        else{
            System.out.println("Not sufficient funds.");
        }
    }

}
