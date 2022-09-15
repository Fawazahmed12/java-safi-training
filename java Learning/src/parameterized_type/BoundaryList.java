package parameterized_type;

import java.util.ArrayList;
import java.util.List;

public class BoundaryList {
//    List<String> list = new ArrayList<String>();
//    public String getFirst(){
//        return list.get(0);
//    }
//
//    public static void main(String[] args) {
//
//        BoundaryList lis = new BoundaryList();
//        lis.getFirst();
//    }
public static void main(String[] args)
{
//if i want to add some more customerList or age List ,
           //  we don't put String (type), directly put parameterized type <T>.

    List<String> list = new ArrayList<String>();

    // using add() to initialize values
    list.add("apple");
    list.add("orange");
    list.add("pineapple");
    list.add("grape");
    list.add("mango");


    // printing initial value ArrayList
    System.out.print("ArrayList: " + list);

    // find first element
    String first = list.get(0);

    // find last element
    String last = list.get(list.size() - 1);

    // find middle element
    String middle = list.get(list.size() /2);

    // print first and last element of ArrayList
    System.out.println("\nFirst : " + first
            + ", Last : " + last+ ", Middle : " + middle);
}
}
