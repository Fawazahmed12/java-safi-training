package shapes.myshapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<Shape> shapeList = new ArrayList<Shape>();

        Shape values = new Shape(4,4.5,5,3);

        shapeList.add(values);

        for(Shape c:shapeList){
            c.getArea();
            System.out.println();
        }
    }
}

//output:
//    Area of Circle is: 50.285714285714285
//    Area of Square is: 20.25
//    Area of Triangle is: 7.5