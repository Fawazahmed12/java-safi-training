package staticMethodNonStaticMethod;

public class Create {
    public static void main(String args[]){
        System.out.println("without-instance");
        Fawaz.myAge();
    }
}

class Fawaz {
    public static void myAge(){
        System.out.println("i am just 22");
    }
}


//public class Create {
//    public static void main(String args[]){
//        System.out.println("with-instance");
//        Fawaz age = new Fawaz();
//        age.myAge();
//    }
//}
//
//class Fawaz {
//    public  void myAge(){
//        System.out.println("i am just 22");
//    }
//}