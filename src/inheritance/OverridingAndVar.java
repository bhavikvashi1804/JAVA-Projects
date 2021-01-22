package inheritance;

public class OverridingAndVar {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.print();
        System.out.println(p1.name);

        Male m1 = new Male();
        m1.print();
        System.out.println(m1.name);

        Person p2 = new Male();
        p2.print();
        System.out.println(p2.name);

    }
}


class Person{
    String name = "Person";

    public void print(){
        System.out.println("Method of Person");
    }

}

class  Male extends Person{
    String name = "Male Person";

    @Override
    public void print(){
        System.out.println("Method of Male Person");
    }

}