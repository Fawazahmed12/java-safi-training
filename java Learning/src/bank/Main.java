package bank;

public class Main {
    public  static void main(String args[]){
// creating savings account object
        Account SAccount = new Savings(50000);

        SAccount.Deposit(1000);
        SAccount.printSavingAccountBalance();

        SAccount.Withdraw(3000);
        SAccount.printSavingAccountBalance();

        System.out.println();

        // creating current account object
        Account CAccount = new Current(50000);

        CAccount.Deposit(1000);
        CAccount.printCurrentAccountBalance();

        CAccount.Withdraw(3000);
        CAccount.printCurrentAccountBalance();
    }
}
