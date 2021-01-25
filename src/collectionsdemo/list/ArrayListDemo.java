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


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        System.out.println(arrayList);

    }
}
