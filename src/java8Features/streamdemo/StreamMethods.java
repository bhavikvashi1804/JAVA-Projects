package java8Features.streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

    public static void main(String[] args) {
        peekDemo();
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

    public static void peekDemo(){
        Stream.of("bus", "car", "bycle", "flight", "train")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }
}
