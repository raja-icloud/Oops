import java.util.Map;
import java.util.TreeMap;

// Below classes are coming under Map Interface

// HasMap --> used to create an object with key/value, it wont maintain insertion order
// LinkedHashMap --> used to create an object with key/value, it will maintain insertion order
// TreeMap --> used to create an object with key/value, but it will give sorted key object
// ConcurrentHashMap --> used to create an object with key/value & thread safe

public class MapConcept {
    public static void main(String[] args) {
        Map<String, String> userObject = new TreeMap<>();

        userObject.put("name", "raja");
        userObject.put("age", "33");
        userObject.put("address", "chennai");
        userObject.put("email", "raja@mail.com");
        userObject.put("address", "trichy");

        System.out.println(userObject);
    }
}
