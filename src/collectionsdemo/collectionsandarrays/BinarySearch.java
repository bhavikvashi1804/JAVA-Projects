package collectionsdemo.collectionsandarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();

        list.add("Bhavik");
        list.add("Raj");
        list.add("Bholu");
        list.add("Jay");


        Collections.sort(list);
        System.out.println(list);
        int index = Collections.binarySearch(list,"Raj");
        System.out.println(index);

        //for not found, it returns -ve value
        //provides where it can be inserted
        // [A,B,X,Z] => -3
    }
}
