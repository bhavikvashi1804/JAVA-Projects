package java8Features.predicate;

import java.util.function.Predicate;

public class GreaterThan20 {
    public static void main(String[] args) {

        Predicate<Integer> predicate = (i)->(i>20);
        System.out.println(predicate.test(25));
        System.out.println(predicate.test(15));
    }
}
