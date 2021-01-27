package java8Features.functioninterface;

import java.util.function.Function;

public class FindLength {

    public static void main(String[] args) {
        Function<String,Integer> findLength = (s)-> (s.length());

        String s = "Bhavik";

        int len = findLength.apply(s);
        System.out.println(len);

    }

}
