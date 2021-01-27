package java8Features.defaultmethods;

public class DiamondProblem {
    public static void main(String[] args) {
        P p = new S();
        p.m1();

    }
}

interface P{
    default void  m1(){
        System.out.println("Default method m1 inside A");
    }
}

interface Q extends P{
    default void  m1(){
        System.out.println("Default method m1 inside Q");
    }
}

interface R extends P{
    default void  m1(){
        System.out.println("Default method m1 inside R");
    }
}

class S implements Q,R{
    @Override
    public void m1() {
        System.out.println("Default method m1 inside S");
    }
}