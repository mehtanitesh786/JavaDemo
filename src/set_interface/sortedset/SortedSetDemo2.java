package set_interface.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo2 {
    public static void main(String[] args) {
        SortedSet<String> fruit = new TreeSet<>();

        fruit.add("Orange");
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Apple");

        System.out.println(fruit);

        System.out.println("First: " + fruit.first()); // Output: Apple
        System.out.println("Last: " + fruit.last());   // Output: Orange
    }
}
