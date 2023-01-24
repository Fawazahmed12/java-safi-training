package map_Interface.valueAndreference;

public class PassbyValue {

     int a = 10;

    void call(int a) {
        a = a + 5;
        System.out.println(a);
    }

    public static void main(String[] args) {

        int x = 6;
        int y = 10;
        x = y;
        y = x;
        x = 5;
        x = y;
//        System.out.println(x);
//        System.out.println(y);

//        a = a + 10;
//        System.out.println(a);

        PassbyValue p = new PassbyValue();
        p.call(5);

    }
}
