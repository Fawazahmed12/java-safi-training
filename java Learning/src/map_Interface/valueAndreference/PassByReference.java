package map_Interface.valueAndreference;

import java.util.Arrays;
import java.util.List;

public class PassByReference {
    public static void main(String[] args) {
        List<String> DAYS = Arrays.asList("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        System.out.println(DAYS.indexOf("Fri")); //5
        System.out.println(DAYS.size()); //7
        System.out.println(DAYS.get(6)); //sat
    }
}

