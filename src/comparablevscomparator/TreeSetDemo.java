package comparablevscomparator;


import java.util.Comparator;
import java.util.TreeSet;

class TreeSetComparator implements Comparator{


    @Override
    public int compare(Object o1, Object o2) {

        String s1=o1.toString();
        String s2=o2.toString();

        return s1.compareTo(s2);
    }
}

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet t= new TreeSet(new TreeSetComparator());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("d"));
        t.add(new StringBuffer("c"));
        t.add(new StringBuffer("k"));
        t.add(new StringBuffer("j"));

        System.out.println(t);
    }
}
