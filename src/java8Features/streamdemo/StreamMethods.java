package java8Features.streamdemo;

import java.util.Arrays;
import java.util.List;

public class StreamMethods {

    public static void main(String[] args) {
        forEachDemo();
    }

    public static  void forEachDemo(){
        List<String> vechicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

        vechicles.stream().filter(str->str.length() > 3).map(String::toUpperCase).sorted().forEach(System.out::println);;
    }
}
