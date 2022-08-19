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
    public void printSavingAccountBalance(){
        System.out.println("Balance in your saving account:"+balance);
    }
    public void printCurrentAccountBalance(){
        System.out.println("Balance in your current account:"+balance);
    }

}

