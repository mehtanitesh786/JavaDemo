package comparablevscomparator;

import java.util.Collections;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
    private String name;
    private int eid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public Employee(String name, int eid) {
        this.name = name;
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", eid=" + eid +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.eid-o.eid;
    }
}
public class CompComp {

    public static void main(String[] args) {

        Employee e1 = new Employee("nitesh",10);
        Employee e2= new Employee("divya",20);
        Employee e3= new Employee("Jyoti",5);
        Employee e4= new Employee("kishan",9);
        Employee e5= new Employee("chanda",8);

        TreeSet<Employee> t = new TreeSet<>();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);

        System.out.println(t);

        TreeSet t2= new TreeSet<>(new MyComparator());

        t2.add(e1);
        t2.add(e2);
        t2.add(e3);
        t2.add(e4);
        t2.add(e5);
        System.out.println(t2);

    }
}
