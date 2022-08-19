package bankusingscanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainMenuDetails();
    }

    public static void mainMenuDetails() {
        Account myAcc = new Account();
        Scanner myObj = new Scanner(System.in);
        System.out.println("\n1. Amount \n2. Display All \n3. Exit ");
        while (true) {
            System.out.println("Type an option (1,2,3) : ");
            int number = myObj.nextInt();
            if (number == 1) {
                accountDetails(myObj);
            }
            if (number == 2) {
//                myShape.getArea();
            }
            if (number == 3) {
                System.out.println("Exit the program");
                break;
            }
        }
    }

    public static void accountDetails(Scanner myObj){
        System.out.println("choose one of the following an option: \nA. Deposit amount \nB. Withdraw Amount  ");
        String letter = myObj.next();
        if (letter.equalsIgnoreCase("A")) {
//            Circle circleArea = new Circle();
//            circleArea.circleDetails(myObj);
//            myShape.addShape(circleArea);
            Account amount = new Account();

        }
        if (letter.equalsIgnoreCase("B")) {
//            Square squareArea = new Square();
//            squareArea.squareDetails(myObj);
//            myShape.addShape(squareArea);
        }
    }
//    public  static void main(String args[]){
//// creating savings account object
//        Account SAccount = new Savings(50000);
//
//        SAccount.Deposit(1000);
//        SAccount.printSavingAccountBalance();
//
//        SAccount.Withdraw(3000);
//        SAccount.printSavingAccountBalance();
//
//        System.out.println();
//
//        // creating current account object
//        Account CAccount = new Current(50000);
//
//        CAccount.Deposit(1000);
//        CAccount.printCurrentAccountBalance();
//
//        CAccount.Withdraw(3000);
//        CAccount.printCurrentAccountBalance();
//    }
}
