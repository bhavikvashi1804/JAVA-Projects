package collectionsdemo.set;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> list = new ArrayList<Integer>();
        for (int i= 0;i<10;i++){
            list.add(random.nextInt(10));
        }
        Set<Integer> set = new HashSet<Integer>(list);
        //list => hashset provide in arg when you create an object
        System.out.println("Array List is: "+ list);
        System.out.println("HashSet is: "+ set);


    }
}
