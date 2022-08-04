package shapes.myshapes;


public class Shape {

    double  areaOfCircle;

    double areaOfSquare;

    double areaOfTriangle;

    Shape(double radius,double side,double base,double height) {
        this.areaOfCircle = radius;
        areaOfCircle= (22*radius*radius)/7;

        this.areaOfSquare = side;
        areaOfSquare = side*side;

        this.areaOfTriangle = base;
        this.areaOfTriangle = height;
        areaOfTriangle = (base*height)/2;
    }



    public void getArea(){
        System.out.println("Area of Circle is: " + areaOfCircle);
        System.out.println("Area of Square is: " + areaOfSquare);
        System.out.println("Area of Triangle is: " + areaOfTriangle);
    }
}