import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

public class Day {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime date_time = LocalDateTime.now();

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneOffset.UTC);

        System.out.println(date_time);
        System.out.println(zonedDateTime);


        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 11, 34);

        numbers.forEach(Day::print);

        // numbers.forEach((number)->{
        //     System.out.println(number);
        // });
        // for (Integer number : numbers) {
        //     System.out.println(number);
        // }
    }

    public static void print(Integer number) {
        System.out.println(number);
    }
}
