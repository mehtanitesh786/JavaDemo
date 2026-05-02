package comparablevscomparator;

import java.util.Comparator;
import java.util.TreeSet;

class TreeSetComparator2 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1=(Integer) o1;
        Integer i2=(Integer) o2;

        return -i1.compareTo(i2);
    }
}
public class TreeSetDemo2 {
    public static void main(String[] args) {

        TreeSet t = new TreeSet(new TreeSetComparator2());
        t.add(10);
        t.add(0);
        t.add(3);
        t.add(2);

        System.out.println(t);


    }
}
