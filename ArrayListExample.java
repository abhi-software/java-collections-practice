import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Accessing elements
        System.out.println("ArrayList: " + arrayList);

        // Iterating through elements
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
    }
}
