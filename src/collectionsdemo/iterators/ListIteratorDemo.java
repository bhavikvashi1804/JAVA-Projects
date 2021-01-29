package collectionsdemo.iterators;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> treeSet = new LinkedList<String>();
        treeSet.add("xyz");
        treeSet.add("abc");
        treeSet.add("pqr");
        treeSet.add("efg");

        System.out.println(treeSet);

        ListIterator<String> iterator = treeSet.listIterator();
        System.out.println("Forward direction");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println("\nBackward direction");
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous()+" ");
        }
    }
}
