package lambda_learning;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String args[]){
//        IDrawable myobj = new Pencil();
//        myobj.draw();
//
        //anonymous function: we directly call the function here,avoid pencil class
//        IDrawable myobj = new IDrawable() {
//            @Override
//            public void draw() {
//                System.out.println("rasik");
//            }
//        };
//        myobj.draw();



        //laambda:
        //input = token = bodyExplanation
//        IDrawable obj = () -> {
//            System.out.println("hello");
//        };
//
//        obj.draw();


        // if we hava singleline output, we can modify the above line like that also:
//        IDrawable obj = () -> System.out.println("hello");
//        obj.draw();




//        Supplier supplier = new Supplier() {
//            @Override
//            public Object get() {
//                return new Pencil();
//            }
//        };
//        supplier.get();


//        Supplier<Pencil> supplier1 = new Supplier<Pencil>() {
//            @Override
//            public Pencil get() {
//                return new Pencil();
//            }
//        };
//        supplier1.get();


        // we can write like that also:
//        Supplier<Pencil> supplier1 = () -> new Pencil();
//        supplier1.get();




//        Consumer consumer = new Consumer() {
//            @Override
//            public void accept(Object o) {
//                return;
//            }
//        };



    }
}
