package shapesusingscanner;

import java.util.Scanner;

public class Triangle extends Shapes{
    double base;
    double height;

//    public Triangle(double b, double h) {
//        this.base = b;
//        this.height = h;
//    }

    public void findArea() {
        this.area = (this.base *  this.height)/2;
        this.name = "Triangle area";
        System.out.println("Rectangle Area: " + area);
    }

    public void triangleDetails(Scanner circle) {
        System.out.println("enter the triangle base :");
        this.base = circle.nextInt();
        System.out.println("enter the triangle height :");
        this.height = circle.nextInt();
        findArea();
    }
}
