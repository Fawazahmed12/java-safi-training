package shapebysafi;

public class Main {
    public static void main(String[] args){
        Shapes shapes = new Shapes();


        Shape square = new Square(12);
        shapes.addShape(square);

        Shape rect = new Rectangle(12.5, 15);
        shapes.addShape(rect);

        Shape triangle = new Triangle(8, 10.5);
        shapes.addShape(triangle);

        Shape circle = new Circle(4.5);
        shapes.addShape(circle);

        shapes.getArea();
    }
}
