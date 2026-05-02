package comparablevscomparator;

import java.util.Comparator;
import java.util.TreeSet;

class DemoComparator implements Comparator{


    @Override
    public int compare(Object o1, Object o2) {

        String s1=o1.toString();
        String s2= o2.toString();
        int l1=s1.length();
        int l2=s2.length();
        if(l1>l2){
            return 1;
        }else if (l1<l2){
            return -1;
        }else {
            return s1.compareTo(s2);
        }
    }
}

public class ComparatorExample {
    public static void main(String[] args) {

        TreeSet t = new TreeSet<>(new DemoComparator());
        t.add("A");
        t.add(new StringBuffer("ABCD"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        t.add("ABCD");
        t.add("A");
        System.out.println(t);
    }
}
