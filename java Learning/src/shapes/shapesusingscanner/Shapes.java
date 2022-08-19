package shapes.shapesusingscanner;

import java.util.ArrayList;
import java.util.List;

public class Shapes {
    List<Shapes> shapeList = new ArrayList();
    double area;
    String name;

    public void addShape(Shapes shape){
        shapeList.add(shape);
    }
    public void getArea() {
        shapeList.forEach(shape -> System.out.println(shape.name+" "+ shape.area));
    }
}
