package java8Features.streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapStrings {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Bhavik");
        list.add("RaJ");
        list.add("AmaZon");

        List<String> listInLowerCase = list.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
        for(String s: listInLowerCase){
            System.out.println(s);
        }
    }
}
