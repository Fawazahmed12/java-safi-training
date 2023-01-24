package map_Interface.stream_filter_And_map;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        FilterExample filterExample = new FilterExample();
        filterExample.myFilter();

    }


    void myFilter() {
        List<String> stringList = Arrays.asList("reyaaz","nabeel","salmaan","hi","dog","rafeek");

        stringList.stream().filter(str -> str.startsWith("r")).forEach(System.out::println);

//        System.out.println(stringList.get(0));

//        stringList.stream().filter(s -> s.length() < 5).forEach(System.out::println);

    }
}
