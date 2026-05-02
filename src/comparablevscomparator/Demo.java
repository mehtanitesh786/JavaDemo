package comparablevscomparator;

import java.util.*;
class  Student{
  int age;
  String name;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Demo {
    public static void main(String[] args) {

        Comparator<Integer> com= new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                    if(o1%10>o2%10){
                        return 1;
                    }else{
                        return -1;
                    }
            }
        };


        List<Integer> nums= new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums,com);
        System.out.println(nums);

        Comparator<Student> stu= (o1,o2)->o1.age> o2.age? 1 : -1;


        List<Student> students= new ArrayList<>();
        students.add(new Student("Nitesh",32));
        students.add(new Student("Navin",21));
        students.add(new Student("Jyoti",22));
        students.add(new Student("Divya",19));


        Collections.sort(students,stu);
        for(Student s :students){

            System.out.println(s);
        }



    }
}
