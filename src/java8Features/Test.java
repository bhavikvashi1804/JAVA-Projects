package java8Features;

public class Test {
    public static void main(String[] args) {
        A a = ()-> System.out.println("Inside my method lambda");
        a.myMethod();
    }
}
