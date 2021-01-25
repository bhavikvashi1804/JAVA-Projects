package collectionsdemo.comparator;

import java.util.HashSet;
import java.util.Set;

public class CompareObjectsDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Bhavik",22);

        Student s2 = new Student("Raj",22);
        Student s3 = new Student("Bhavik",22);

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));

        Set<Student> set = new HashSet<Student>();
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
            return  -1;
        }
        else if(!s1.name.equals(s2.name)){
            return  -1;
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