package collectionsdemo.comparator;

import java.util.Set;
import java.util.TreeSet;

public class SBComparatorDemo {
    public static void main(String[] args) {

        //use own Comparator
        Set<StringBuffer> set = new TreeSet<StringBuffer>(new SBComparator());
        set.add(new StringBuffer("abc"));
        set.add(new StringBuffer("xyz"));
        set.add(new StringBuffer("def"));
        set.add(new StringBuffer("mno"));

        System.out.println(set);
    }
}
