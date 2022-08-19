package shapes.shapebysafi;

public class Square extends Shape {
    double side;

    public Square(double a){
        this.side = a;
    }

    public void findArea() {
        double area = Math.pow(this.side, 2);
        System.out.println("Square Area: " + area);
    }
}
