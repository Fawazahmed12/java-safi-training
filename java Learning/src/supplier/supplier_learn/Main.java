package supplier.supplier_learn;

public class Main {
    public static void main(String args[]){

        MySupplier<Orange> supplier2 = new MySupplier<Orange>() {
            @Override
            public Orange get() {
                return new Orange();
            }
        };
        supplier2.get();


        MySupplier<Orange> supplier3 = () -> new Orange();
        supplier3.get();

    }
}
