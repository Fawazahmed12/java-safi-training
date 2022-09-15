package parameterized_type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BoundaryListUsingParameterized{
public static void main(String[] args) {
    ParameterizedCollection faw = new ParameterizedCollection();
    faw.myAge();
}
}

class ParameterizedCollection <T>{
    public void myAge(){
        //if i want to add some more customerList or age List ,
               //  we don't put String (type), directly put parameterized type <T>.
        List<T> list = new ArrayList<T>();

        // using add() to initialize values
        list.add((T) "apple");
        list.add((T) "orange");
        list.add((T) "pineapple");
        list.add((T) "grape");
        list.add((T) "mango");

        // printing initial value ArrayList
        System.out.print("ArrayList: " + list);

        // find first element
        T first = list.get(0);

        // find last element
        T last = list.get(list.size() - 1);

        // find middle element
        T middle = list.get(list.size() /2);

        // print first and last element of ArrayList
        System.out.println("\nFirst : " + first
                + ", Last : " + last
                   + ", Middle : " + middle);
    }
}
