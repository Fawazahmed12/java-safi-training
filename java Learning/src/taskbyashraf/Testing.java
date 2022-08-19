package taskbyashraf;

public class Testing {
    public static void main(String args[]){
        String str1 = new String("123");
        String str2 = new String("123");
        //it check only the refereance,so we didn't use
        System.out.println(str1 ==str2);

        //always prefer equals method to compare:
        System.out.println(str1.equals( str2));
    }
}
