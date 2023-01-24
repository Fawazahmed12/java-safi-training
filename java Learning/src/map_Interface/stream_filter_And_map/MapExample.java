package map_Interface.stream_filter_And_map;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        MapExample mapExample = new MapExample();
        mapExample.myMap();
    }

    void myMap () {
        List<Integer> integerList = Arrays.asList(1,3,4,5,6,76,56);
        integerList.stream().map(inte -> inte * 2).forEach(System.out::println);
    }
}
