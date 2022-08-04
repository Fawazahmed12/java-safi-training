package product;

import java.util.Scanner;

public class ChocolateBox {
    public static void main(String args[]){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("chocolatebysafi box contains 10 chocolates");

        int totalChocolates = 10;
        while(totalChocolates > 0) {
            System.out.println("Number: ");
            int number = Scanner.nextInt();

            if (number < totalChocolates){
                totalChocolates = totalChocolates - number;
                System.out.println("Remaining chocolates: "+totalChocolates);
            }
            else if(number > totalChocolates){
                int  remaining = number - totalChocolates;
                System.out.println("not enough chocolates and Only" +" "+remaining+" chocolatebysafi left");
                break;
            }
            else{
                break;
            }
        }
    }
}

/*
output:

    chocolatebysafi box contains 10 chocolates
        Number:
        5
        Remaining chocolates: 5
        Number:
        4
        Remaining chocolates: 1
        Number:
        2
        not enough chocolates and Only 1 chocolatebysafi left

        */