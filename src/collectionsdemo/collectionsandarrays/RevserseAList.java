package collectionsdemo.collectionsandarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RevserseAList {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();

        list.add("Bhavik");
        list.add("Raj");
        list.add("Bholu");
        list.add("Jay");

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
