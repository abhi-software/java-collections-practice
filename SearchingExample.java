import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchingExample {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eva");

        // Sort the ArrayList in alphabetical order
        Collections.sort(names);

        // Perform binary search on the sorted list
        int index = Collections.binarySearch(names, "David");

        // Check if the element was found
        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
