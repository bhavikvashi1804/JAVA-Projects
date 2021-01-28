package java8Features.streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethods {

    public static void main(String[] args) {
        diff();
    }

    public static  void forEachDemo(){
        List<String> vechicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

        vechicles.stream().filter(str->str.length() > 3).map(String::toUpperCase).sorted().forEach(System.out::println);;
    }

    public static  void paralleDemo(){
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

        vehicles.parallelStream().filter(str->str.length() > 3).map(String::toUpperCase).sorted().forEach(System.out::println);;
    }

    public static  void diff(){
        List<String> vehicles = new ArrayList<>(Arrays.asList("bus", "car", "bicycle", "flight", "train"));

        Stream<String> vStream = vehicles.parallelStream();
        vehicles.add("bike");
        vStream.filter(str->str.length() > 3).map(String::toUpperCase).sorted().forEach(System.out::println);
    }
}
