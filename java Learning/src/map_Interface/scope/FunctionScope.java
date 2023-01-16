package map_Interface.scope;

public class FunctionScope {
    static int x = 10;

    public static void main(String[] args) {
        int age = 30;
        age = 50;
        age = age + 10;
        age = 70;
        int age1 = 20;
        age = age1;
        int age2 = age + age1;
        System.out.println(age2);
        myMethod();
    }

    public static void myMethod() {
        System.out.println(x);
    }
}
