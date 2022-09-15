package BasicsLearning.switch_case;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Data {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022,03,23);
        System.out.println("the current date is "+
                date);


        // the current time
        LocalTime time = LocalTime.now();
        System.out.println("the current time is "+
                time);


        // will give us the current time and date
        LocalDateTime current = LocalDateTime.now();
        System.out.println("current date and time : "+
                current);

    }
}
