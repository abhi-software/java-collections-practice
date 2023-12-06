import java.util.Vector;
import java.util.List;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        List<String> vector = new Vector<>();

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Accessing elements
        System.out.println("Vector: " + vector);

        // Iterating through elements
        for (String fruit : vector) {
            System.out.println(fruit);
        }
    }
}
