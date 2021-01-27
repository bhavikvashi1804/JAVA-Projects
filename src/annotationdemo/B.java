package annotationdemo;

import java.util.ArrayList;
import java.util.List;


public class B {
    @SuppressWarnings(value = {"deprecation"})
    public static void main(String[] args) {
        A a= new A();
        System.out.println(a);

        C c = new C();
        c.method1();

        c.method2();
    }

    @SuppressWarnings(value = {"deprecation","rawtypes"})
    public static void myMethod(){
        A a= new A();
        System.out.println(a);

        C c = new C();
        c.method1();

        c.method2();

        List list = new ArrayList();
        System.out.println(list);
    }
}
