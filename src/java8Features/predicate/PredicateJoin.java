package java8Features.predicate;

import java.util.function.Predicate;

public class PredicateJoin {
    public static void main(String[] args) {
        int[] x = {0,10,20,30,40,50,60,70,80,90};

        Predicate<Integer> predicate = (i)->(i>50);

        check(predicate,x);
    }

    static void check(Predicate<Integer> p,int[] x){
        for (int i=0;i<x.length;i++){
            if(p.test(x[i])){
                System.out.println(x[i]+" > 50");
            }
            else{
                System.out.println(x[i]+" <= 50");
            }
        }
    }
}
