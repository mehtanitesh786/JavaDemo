package comparablevscomparator;

import java.util.Comparator;
import java.util.TreeSet;
class TreeSetComparator1 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1=o1.toString();
        String s2=o2.toString();
        return -s1.compareTo(s2);
    }
}

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>(new TreeSetComparator1());
        t.add("Nitesh");
        t.add("Divya");
        t.add("Chanda");
        t.add("bhagavati bhai");
        t.add("kishan");
        t.add("kishan");
        System.out.println(t);
    }
}
