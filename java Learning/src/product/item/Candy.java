package product.item;

import java.util.Scanner;

public class Candy {

    int totalChocolates;

    Candy(int totalChocolates) {
        this.totalChocolates = totalChocolates;
    }

    public  void myMethod (){
        Scanner Scanner = new Scanner(System.in);
        while(totalChocolates > 0) {
            System.out.println("Number: ");
            int number = Scanner.nextInt();

            if (number < totalChocolates){
                totalChocolates = totalChocolates - number;
                System.out.println("Remaining chocolates: "+totalChocolates);
            }
            else if(number > totalChocolates){
                int  remaining = number - totalChocolates;
                System.out.println("not enough chocolates and Only" +" "+remaining+" chocolate left");
                break;
            }
            else{
                break;
            }
        }

    }
}
