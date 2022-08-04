package shapesusingscanner;


import java.util.Scanner;

public class Circle extends Shapes{
    double radius;

//    public Circle(double r) {
//        this.radius = r;
//    }

    public void findArea() {
        this.area = (22 * this.radius *  this.radius)/7;
        this.name = "circle area";
        System.out.println("Circle Area: " + area);
    }

    public void circleDetails(Scanner circle) {
        System.out.println("enter the circle radius :");
        this.radius = circle.nextInt();
        findArea();
    }

}
