import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListAndSetAndMap {
    public static void main(String[] args) {
        Map<String, Object> userOne = new HashMap<>();
        userOne.put("id", 1);
        userOne.put("name", "Raja");
        System.out.println(userOne);

        Map<String, Object> userTwo = new HashMap<>();
        userTwo.put("id", 2);
        userTwo.put("name", "Raja");
        System.out.println(userTwo);

        Set<Map<String, Object>> usersList = new HashSet<>(); // it wont allow duplicates
        // List<Map<String, Object>> usersList = new ArrayList<>(); // it will accept duplicate
        usersList.add(userOne);
        usersList.add(userTwo);

        System.out.println(usersList);
    }
}
