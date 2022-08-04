package shapesusingscanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainMenuDetails();
    }

    public static void mainMenuDetails() {
        Shapes myShape = new Shapes();
        Scanner myObj = new Scanner(System.in);
        System.out.println("\n1. Add a shape \n2. Display All Area \n3. Exit ");
        while (true) {
            System.out.println("Type an option (1,2,3) : ");
            int number = myObj.nextInt();
            if (number == 1) {
                shapesDetails(myObj,myShape);
            }
            if (number == 2) {
                myShape.getArea();
            }
            if (number == 3) {
                System.out.println("Exit the program");
                break;
            }
        }
    }

    public static void shapesDetails(Scanner myObj,Shapes myShape) {
        System.out.println("choose one of the following an option: \nA. Circle \nB. Square \nC. Triangle ");
        String letter = myObj.next();
            if (letter.equalsIgnoreCase("A")) {
                Circle circleArea = new Circle();
                circleArea.circleDetails(myObj);
                myShape.addShape(circleArea);
            }
            if (letter.equalsIgnoreCase("B")) {
                Square squareArea = new Square();
                squareArea.squareDetails(myObj);
                myShape.addShape(squareArea);
            }
            if (letter.equalsIgnoreCase("C")) {
                Triangle triangleArea = new Triangle();
                triangleArea.triangleDetails(myObj);
                myShape.addShape(triangleArea);
            }
    }
}
