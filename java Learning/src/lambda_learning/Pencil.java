package lambda_learning;

public class Pencil implements IDrawable {
    @Override
    public void draw() {
        System.out.println("he is drawing");
    }


    public Pencil(){
        draw();
    };

    public void draw2(Object o) {
    }


}

