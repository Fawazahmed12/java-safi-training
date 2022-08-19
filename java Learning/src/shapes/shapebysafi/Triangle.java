package shapes.shapebysafi;

public class Triangle extends Shape implements Drawable, Danceable {
    double base;
    double height;

    public Triangle(double b, double h){
        this.base = b;
        this.height = h;
    }

    public void findArea() {
        double area = (this.base * this.height)/2;
        System.out.println("Triangle Area: " + area);
    }

    @Override
    public void draw() {

    }

    @Override
    public void dance() {

    }
}
