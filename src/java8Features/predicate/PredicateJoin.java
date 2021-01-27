package java8Features.predicate;

import java.util.function.Predicate;

public class PredicateJoin {
    public static void main(String[] args) {
        int[] x = {0,10,20,30,40,50,60,70,80,90};

        Predicate<Integer> predicate = (i)->(i>50);
        Predicate<Integer> even = (i)->(i%2==0);

        System.out.println(">50");
        check(predicate,x);
        System.out.println("<=50");
        check(predicate.negate(),x);

        check(even,x);

        System.out.println(">50 & Even");
        check(predicate.and(even),x);


    }

    static void check(Predicate<Integer> p,int[] x){
        for (int i=0;i<x.length;i++){
            if(p.test(x[i])) {
                System.out.println(x[i]);
            }
        }
    }
}
