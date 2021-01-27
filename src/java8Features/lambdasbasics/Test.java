package java8Features.lambdasbasics;

public class Test {
    public static void main(String[] args) {
        A a = ()-> System.out.println("Inside my method lambda");
        a.myMethod();
    }
}
