package map_Interface.example1;

public class Try {
    public static void main(String[] args) {
        myClass.myMethod(5);
        System.out.println(myClass.my2Method(8));
    }
}

class myClass {
    static void myMethod(int age) {
        System.out.println("nabeel age is " + age);
    }

     static int my2Method(int number) {
        return 5+number;
    }
}
