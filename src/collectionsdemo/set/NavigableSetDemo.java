package collectionsdemo.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo
{
    public static void main(String[] args)
    {
        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(0);
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);

        // Get a reverse view of the navigable set
        NavigableSet<Integer> reverseNs = ns.descendingSet();

        // Print the normal and reverse views
        System.out.println("Normal order: " + ns);
        System.out.println("Reverse order: " + reverseNs);

        NavigableSet<Integer> threeOrMore = ns.tailSet(3, true);
        System.out.println("Value 3 or more: " + threeOrMore);

        NavigableSet<Integer> threeOrLess= ns.headSet(3,true);
        System.out.println("Value 3 or less: " + threeOrLess);

        System.out.println("lower(3): " + ns.lower(3));
        //the greatest element in this set strictly less than the given element,

        System.out.println("floor(3): " + ns.floor(3));
        //the greatest element in this set less than or equal to the given element

        System.out.println("higher(3): " + ns.higher(3));
        //the least element in this set strictly greater than the given element

        System.out.println("ceiling(3): " + ns.ceiling(3));
        //the least element in this set greater than or equal to the given element

        System.out.println(ns);
        System.out.println("pollFirst(): " + ns.pollFirst());
        //removes the first/head
        System.out.println("Navigable Set: " + ns);

        System.out.println("pollLast(): " + ns.pollLast());
        //removes the last/tail
        System.out.println("Navigable Set: " + ns);


    }
}
