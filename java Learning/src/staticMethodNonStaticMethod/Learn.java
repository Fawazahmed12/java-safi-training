package staticMethodNonStaticMethod;

public class Learn {
    public static void main(String args[]){
        Learning obj = new Learning("fawaz");
        obj.mylearn();
//        Learning.mylearn();
    }
}

class Learning{
    String name;

    public Learning(String name){
        this.name = name;
    }
    public  void mylearn() {
        System.out.println(name);
    }
}
