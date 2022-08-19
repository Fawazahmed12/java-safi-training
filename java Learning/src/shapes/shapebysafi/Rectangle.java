package shapes.shapebysafi;

public class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(double l, double b){
        this.length = l;
        this.breadth = b;
    }

    public void findArea() {
        double area = this.length *  this.breadth;
        System.out.println("Rectangle Area: " + area);
    }
}
