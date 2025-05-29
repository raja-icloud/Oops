import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stream {
    public static void main(String[] args) {
        Map<String, Object> userOne = new HashMap<>();
        userOne.put("id", 1);
        userOne.put("name", "raja");
        userOne.put("age", 40);

        Map<String, Object> userTwo = new HashMap<>();
        userTwo.put("id", 2);
        userTwo.put("name", "Joy");
        userTwo.put("age", 15);

        Map<String, Object> userThree = new HashMap<>();
        userThree.put("id", 3);
        userThree.put("name", "nithin");
        userThree.put("age", 21);

        List<Map<String, Object>> usersList = Arrays.asList(userOne, userTwo, userThree, userThree);

        List<Map<String, Object>> voters = usersList.stream().filter(user->(int) user.get("age") > 18).distinct().toList();
        
        System.out.println(voters);


    }

}
