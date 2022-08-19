package bankusingscanner;

public class Savings extends Account {
    private double interestRate = 0.8;
    public Savings(double balance) {
        super();
    }
    @Override
    public void Withdraw(double amount){
        amount = amount + (amount * interestRate);
        super.Withdraw(amount);
    }
    @Override
    public void Deposit(double amount){
        amount = amount + (amount * interestRate);
        super.Deposit(amount);
    }
    public void deposit(){
        System.out.println("enter the amount:");
    }
}
