package P2;

import P1.A;

public class C extends A
{

    public static void main(String[] args) {
        //A objA = new A();
        // System.out.println(objA.c);
        // System.out.println(objA.d);
        C objC = new C();

        //package: different
        //class: different
        //inheritance: yes
        //access: public & protected
        System.out.println(objC.c);
        System.out.println(objC.d);
    }

}
