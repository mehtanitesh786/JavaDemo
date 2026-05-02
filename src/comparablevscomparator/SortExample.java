package comparablevscomparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {

        ArrayList<Emp> emp= new ArrayList<>();
        emp.add(new Emp("Nitesh","8460342398",1));
        emp.add(new Emp("Ankit","9898987676",5));
        emp.add(new Emp("Jyoti","9876565434",3));
        emp.add(new Emp("Divya","8765454323",7));


        Collections.sort(emp,new IdComparator());
        System.out.println("Id Comparator"+emp);

        ArrayList<Emp> emps1= new ArrayList<>(emp);

        Collections.sort(emps1,new NameComparator());

        System.out.println("Name Comparator "+emps1);

    }
}
