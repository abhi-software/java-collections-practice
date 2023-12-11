import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Get value by key
        int value = map.get("two");
        System.out.println("Value for key 'two': " + value);

        // Check if a key exists
        Boolean containsKey = map.containsKey("four");
        System.out.println("Key 'four' exists: " + containsKey);

        // Iterate over the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
