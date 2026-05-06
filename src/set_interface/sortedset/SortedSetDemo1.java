package set_interface.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo1 {
    public static void main(String[] args) {

        SortedSet<Integer> set= new TreeSet<>();
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);

        System.out.println(set);
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());



    }
}
