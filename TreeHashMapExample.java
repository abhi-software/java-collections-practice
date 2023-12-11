import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        // Add key-value pairs
        map.put("one", 1);
        map.put("three", 3);
        map.put("two", 2);

        // Iterate over the map (elements will be sorted)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
