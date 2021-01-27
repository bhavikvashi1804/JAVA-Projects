package java8Features.streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterNumbers {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();

        for(int i=0;i<=10;i++){
            l1.add(i);
        }


        List<Integer> l2 =l1.stream().filter((i)->(i%2==0)).collect(Collectors.toList());
        for(Integer x: l2){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
