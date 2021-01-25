package collectionsdemo.collectionsandarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();

        list.add("Bhavik");
        list.add("Raj");
        list.add("Bholu");
        list.add("Jay");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


        //use your own comparator
        List<String> list1= new ArrayList<>();
        list1.add("Bhavik");
        list1.add("Raj");
        list1.add("Bholu");
        list1.add("Jay");

        System.out.println(list1);
        Collections.sort(list1,new MyComparator());
        System.out.println(list1);
    }
}
