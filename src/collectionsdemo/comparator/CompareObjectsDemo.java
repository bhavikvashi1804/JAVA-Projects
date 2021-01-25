package collectionsdemo.comparator;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompareObjectsDemo {
    public static void main(String[] args) {


        Set<Student> set = new TreeSet<Student>(new StudentNameComparator());
        set.add(new Student("Bhavik",22));
        set.add(new Student("Raj",21));
        set.add(new Student("Yash",22));
        set.add(new Student("Bhavik",22));

        for(Student s: set){
            System.out.println(s);
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    int age;

    public  Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        Student s1 = this;
        Student s2 = o;

        if(s1.age < s2.age){
            return  -1;
        }
        else if(s1.age >s2.age){
            return  1;
        }

        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class  StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        String s1 = o1.name;
        String s2 = o2.name;
        return s1.compareTo(s2);
    }
}