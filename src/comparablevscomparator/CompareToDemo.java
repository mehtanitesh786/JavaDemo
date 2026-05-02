package comparablevscomparator;

import java.util.TreeSet;

public class CompareToDemo {
    public static void main(String[] args) {

        TreeSet t = new TreeSet();
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("B"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("K"));

        TreeSet t1= new TreeSet();
        t1.add("a");
        t1.add("Z");
        t1.add("L");
        t1.add("A");
        System.out.println(t1);

        System.out.println(t); //earlier version StringBuffer not implement comparable but in 24 version it will implement
        System.out.println("A".compareTo("Z"));
        System.out.println("Z".compareTo("B"));
        System.out.println("A".compareTo("A"));
        System.out.println("A".compareTo(null));



    }
}
