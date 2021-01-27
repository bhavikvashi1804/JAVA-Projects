package java8Features.predicate;

import java.util.function.Predicate;

public class GreaterThan20 {
    public static void main(String[] args) {

        Predicate<Integer> predicate = (i)->(i>20);
        System.out.println(predicate.test(25));
        System.out.println(predicate.test(15));


        Predicate<String> predicate1 = (s)->(s.length()>5);
        System.out.println(predicate1.test("Bhavik"));
        System.out.println(predicate1.test("Raj"));
    }
}
