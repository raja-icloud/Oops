import java.util.ArrayList;
import java.util.List;

// Below classes are coming under List Interface
// Array List for fast reading
// Linked List for fast updating
// Vector for Multithreading

public class ListConcept {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(); // LinkedList // Vector
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }
        System.out.println(numbers.size());
    }
}
