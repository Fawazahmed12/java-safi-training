package map_Interface;

// there are two types to set the values;
// 1) create the instance and pass the value directly
// 2) create constructor and call the instance and pass the value using (.)

//1)

public class Basic {
    public static void main(String[] args) {
        System.out.println("Hi");
        Bag bag = new Bag();
        bag.from = 2;
        bag.to = 10;

        System.out.println(bag.from);
    }

    public static class Bag{
        int from;
        int to;
    }
}


// 2)

//public class Basic {
//    public static void main(String[] args) {
//        Bag bag = new Bag(2,10);
//        System.out.println(bag.from);
//    }
//
//    public static class Bag{
//        int from;
//        int to;
//
//        public Bag(int from, int to) {
//            this.from = from;
//            this.to = to;
//        }
//    }
//}