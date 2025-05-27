import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection {

    public static void main(String[] args) {

        Map<String, String> user1ByMap = new HashMap<>();
        user1ByMap.put("name", "Lalith");
        user1ByMap.put("age", "30");

        List<Map<String, String>> userList = new ArrayList<>(); // Set is equlivalent to List but does not allow duplicates
        userList.add(user1ByMap);


        System.out.println(userList.get(0).get("name"));
        System.out.println(userList.get(0).get("age"));

        userList.forEach(user -> {
            System.out.println(user.get("name"));
            System.out.println(user.get("age"));
        });
        
    }
}
