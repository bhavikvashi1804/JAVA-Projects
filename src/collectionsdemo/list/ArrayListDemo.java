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

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        System.out.println("First List is: "+ list);
        System.out.println("Second List is: "+ list1);

        //add the two list
        // addAll(collection) at the end
        // addAll(index,collection)
        list.addAll(4, list1);
        System.out.println("First List afterS addAll: "+ list);

        if(list.contains(100)){
            System.out.println("List contains 100");
        }


        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
