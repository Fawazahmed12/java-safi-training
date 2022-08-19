package shapes.shapebysafi;

import java.util.ArrayList;
import java.util.List;

public class Shapes {
    List<Shape> shapeList = new ArrayList();
    List<Drawable> drawables = new ArrayList();

    public void addShape(Shape shape){
        shapeList.add(shape);
    }
    public void getArea() {
//        shapeList.stream().filter(Shape::findArea);

        drawables.forEach(drawable -> drawable.draw());
    }
}
