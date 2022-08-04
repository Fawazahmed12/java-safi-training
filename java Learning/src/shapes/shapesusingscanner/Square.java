package shapesusingscanner;

import java.util.Scanner;

public class Square extends Shapes{
    double side;

//    public Square(double s) {
//        this.side = s;
//    }

    public void findArea() {
        this.area = this.side *  this.side;
        this.name = "square area";
        System.out.println("Square Area: " + area);
    }

    public void squareDetails(Scanner square) {
        System.out.println("enter the square side :");
        this.side = square.nextInt();
        findArea();
    }
}
