package collectionsdemo.list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(new Integer(10));
        al.add(20); // Autoboxing
        al.add(30.45);
        al.add("Hello");

        System.out.println(al);
    }
}
