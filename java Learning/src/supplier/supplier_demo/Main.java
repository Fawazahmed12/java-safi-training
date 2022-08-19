package supplier.supplier_demo;

import java.util.function.Supplier;

public class Main {
    public static void main(String args[]){

        //anonymous function:
        MySupplier supplier1 = new MySupplier() {
            @Override
            public void eat() {
                System.out.println("welcome");
            }
        };
        supplier1.eat();


        //laambda
        MySupplier supplier2 = () -> System.out.println("hello");
        supplier2.eat();


        //supplier:
        Supplier<Apple> supplier = new Supplier<Apple>() {
            @Override
            public Apple get() {
                return new Apple();
            }
        };
        supplier.get().eat();



        Supplier<Apple> supplier3 = () -> new Apple();
        supplier3.get().eat();

    }
}
