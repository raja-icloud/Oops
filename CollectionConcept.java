import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionConcept {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(60);
        numbers.add(70);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);    
        numbers.add(40);
        numbers.add(50);
        numbers.add(80);

        
        Integer maxValue = Collections.max(numbers);
        Integer minValue = Collections.min(numbers);
        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println(maxValue);
        System.out.println(minValue);
        System.out.println(numbers);

    }

    // public static Integer max(List<Integer> numbers) {
    //     Integer maxValue = 0;
    //     for (Integer number : numbers) {
    //         if(number > maxValue) {
    //             maxValue = number;
    //         }
    //     }
    //     return maxValue;
    // }
}
