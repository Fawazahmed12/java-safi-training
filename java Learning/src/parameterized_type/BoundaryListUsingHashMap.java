package parameterized_type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BoundaryListUsingHashMap {
public static void main(String[] args) {
    HashMapType p =new HashMapType();
    p.myList();
}
}

class HashMapType <T>{
    public void myList(){
        //if i want to add some more customerList or age List ,
        //  we don't put String (type), directly put parameterized type <T>.
        HashMap<T, Integer> map1 = new HashMap<>();  //it's a key value pair

        //we can also pass the second parameter as the arrayList
        HashMap<T,ArrayList<T>> map2 = new HashMap<T, ArrayList<T>>();

        map1.put((T) "apple" , 10);
        map1.put((T) "orange" , 20);
        map1.put((T) "pineapple" , 30);
        map1.put((T) "grape" , 40);
        map1.put((T) "mango" , 50);


        System.out.println("Size of map is: "
                + map1.size());

        // printing initial value ArrayList
        System.out.print("ArrayList: " + map1);

        // find first element
        T first = (T) map1.get("apple");



        // print first and last element of ArrayList
        System.out.println("\nFirst : " + first
                );
    }
}
