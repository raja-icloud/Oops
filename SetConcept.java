import java.util.Set;
import java.util.TreeSet;
// Below classes are coming under Set Interface

// HashSet -> it wont allow duplicate value, and it wont maintain insertion order --> more faster then others
// LinkedHasSet -> it wont allow duplicate value, and it will maintain insertion order --> less faster to maintain insertion order
// TreeSet -> It wont allow duuplicate & null value, and it will provide shorted result --> to get sorted list

// ConcurrentSkipListSet --> it wont allow duplicate value, and it is thread safe

public class SetConcept {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(); // 
        numbers.add(1);
        numbers.add(1);
        numbers.add(11);
        numbers.add(0);
        System.out.println(numbers);
    }
}
