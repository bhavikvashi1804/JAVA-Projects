package java8Features.streamdemo;

import java.util.ArrayList;
import java.util.List;
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

        double total = l1.stream().filter(i->i%2==0).count();
        System.out.println("Total no of elements "+ total);





        List<Integer> sorted = l1.stream().sorted().collect(Collectors.toList());

        for(Integer x: sorted){
            System.out.print(x+" ");
        }
        System.out.println();

        List<Integer> sorted1 = l1.stream().sorted((i1, i2)->i2.compareTo(i1)).collect(Collectors.toList());
        for(Integer x: sorted1){
            System.out.print(x+" ");
        }
        System.out.println();


        Integer min = l1.stream().min((i1, i2)->i1.compareTo(i2)).get();
        System.out.println(min);
        Integer max = l1.stream().max((i1, i2)->i1.compareTo(i2)).get();
        System.out.println(max);


        l1.stream().forEach((i)->System.out.println("Number is: "+ i));
    }

}
