import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        List<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Accessing elements
        System.out.println("LinkedList: " + linkedList);

        // Iterating through elements
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
    }
}
