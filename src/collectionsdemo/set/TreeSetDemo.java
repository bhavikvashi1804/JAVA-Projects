package collectionsdemo.set;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {

        Random random = new Random();

        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set1 = new LinkedHashSet<Integer>();
        Set<Integer> set2 = new TreeSet<Integer>();

        for(int i=0;i<10;i++){
            int number = random.nextInt(10);
            System.out.print(number+" ");
            set.add(number);
            set1.add(number);
            set2.add(number);
        }
        System.out.println();

        System.out.println(set);
        System.out.println(set1);
        System.out.println(set2);


        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("xyz");
        treeSet.add("abc");
        treeSet.add("pqr");
        treeSet.add("efg");

        System.out.println(treeSet);

        TreeSet<StringBuffer> treeSet1 = new TreeSet<StringBuffer>();
        treeSet1.add(new StringBuffer("xyz"));
        treeSet1.add(new StringBuffer("abc"));
        treeSet1.add(new StringBuffer("pqr"));
        treeSet1.add(new StringBuffer("efg"));

        System.out.println(treeSet1);
    }
}
