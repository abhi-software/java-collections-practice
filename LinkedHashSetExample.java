import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Apple"); // Duplicate, won't be added

        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
