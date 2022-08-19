package interfacesLearning;

@FunctionalInterface
interface Abc{
    void show();
}

public class InterfaceDemo {
    public static void main(String args[]){
//        Abc obj = new Abc() {
//            @Override
//            public void show() {
//                System.out.println("i am fawaz");
//            }
//        };

        Abc obj = () -> System.out.println("i am fawaz");

        obj.show();
    }
}
