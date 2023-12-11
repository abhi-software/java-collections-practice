import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        // treeSet.add(null); // Uncommenting this line will throw NullPointerException

        System.out.println("TreeSet: " + treeSet);
    }
}
