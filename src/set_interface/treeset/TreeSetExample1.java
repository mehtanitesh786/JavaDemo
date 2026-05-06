package set_interface.treeset;

import java.util.TreeSet;

public class TreeSetExample1 {

    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();

        set.add(20);

        set.add(10);

        set.add(40);

        set.add(80);

        set.add(30);

        //Printing elements of TreeSet

        System.out.println(set);
    }
}
