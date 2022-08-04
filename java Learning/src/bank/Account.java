package bank;

public class Account {
    protected double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public void Withdraw(double amount){
        balance = balance - amount;
    }
    public void Deposit(double amount){
        balance = balance + amount;
    }
    public void printBalance(){
        System.out.println(balance);
    }

}

