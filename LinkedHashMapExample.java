import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        // Add key-value pairs
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Iterate over the map (elements will be in insertion order)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
