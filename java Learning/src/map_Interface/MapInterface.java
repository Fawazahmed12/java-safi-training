package map_Interface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();

//        map1.put("h", new Integer(100));
//        map1.put("w", new Integer(1000));
//        map1.put("t", new Integer(10000));
//        map1.put("qfgdhf",10);
//        map1.put("qdhf",20);
//        map1.put("qdhfretyh",30);
        map1.put("acb", 30);
        map1.put("abc", 10);
        map1.put("acd", 20);

//        map1.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .forEach(System.out::println);


        for (Map.Entry<String,Integer> me : map1.entrySet() ){
            System.out.println(me.getKey()+ ":" + me.getValue());
        }

        System.out.println(map1.entrySet());

        String x = "hey";
        x = "hoi";
        System.out.println( x);

    }
}
