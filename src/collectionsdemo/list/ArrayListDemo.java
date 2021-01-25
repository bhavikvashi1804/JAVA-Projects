package collectionsdemo.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Array List with not specified data type
        ArrayList al = new ArrayList();
        al.add(new Integer(10));
        al.add(20); // Autoboxing
        al.add(30.45);
        al.add("Hello");
        System.out.println(al);

        //Array List with Specified Data type
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        System.out.println(arrayList);

        //Insert and Replace the Elements of Array List
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<11;i++){
           list.add(i*10);
        }
        System.out.println("List is: "+ list);
        //Insert
        list.add(1,15);
        System.out.println("List after the insert: "+ list);
        //Replace
        list.set(1,17);
        System.out.println("List after the replace: "+ list);





    }
}
