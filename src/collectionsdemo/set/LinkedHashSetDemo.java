package collectionsdemo.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        Random random = new Random();

        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set1 = new LinkedHashSet<Integer>();

        for(int i=0;i<10;i++){
            int number = random.nextInt(10);
            System.out.print(number+" ");
            set.add(number);
            set1.add(number);
        }
        System.out.println();

        System.out.println(set);
        System.out.println(set1);
    }
}
