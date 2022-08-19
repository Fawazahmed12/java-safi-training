package BasicsLearning.equals_learning;

public class Equals {
    public static void main(String args[]){
//        String str1 = new String("123");
//        String str2 = new String("123");
        //it check only the referance,so we didn't use
//        System.out.println(str1 == str2);

        //always prefer equals method to compare:
//        System.out.println(str1.equals( str2));


//        String str1 = "123";
//        String str2 = "123";
//        System.out.println(str1.equals(str2));
//        System.out.println(str1 == str2);

//
//        String str1 = new String("123");
//        String str2 = new String("123");
//        System.out.println(str1 == str2);

        String s1 = "TUTORIALSPOINT";
//        String s1 = new String("TUTORIALSPOINT");
        String s2 = new String("TUTORIALSPOINT");
        //Reference comparison
        System.out.println(s1 == s2);
        //Content comparison
        System.out.println(s1.equals(s2));
        // integer-type
        System.out.println(10 == 10);
        // char-type
        System.out.println('a' == 'a');
    }
}
