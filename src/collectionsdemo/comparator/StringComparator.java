package collectionsdemo.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int l1 = o1.length();
        int l2 = o2.length();

        if(l1<l2){
            return -1;
        }
        else if(l1>l2){
            return  1;
        }
        else{
            return o1.compareTo(o2);
        }
    }
}


class Test{
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>(new StringComparator());
        set.add("abcxyz");
        set.add("xyzaaa");
        set.add("dsadadadasdasdds");
        for(String obj: set){
            System.out.print(obj+" ");
        }
        System.out.println();
    }
}