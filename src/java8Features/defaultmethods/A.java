package java8Features.defaultmethods;

public interface A {
    default  void m1(){
        System.out.println("Default method m1 inside A");
    }
}

class  B implements A{

}
class C implements A{
    //here you need to mark public
    //bcz by default in interface all methods are public
    @Override
    public void m1(){
        System.out.println("Default method m1 inside C");
    }
}

class  ADemo{
    public static void main(String[] args) {
        A a= new B();
        a.m1();

        A a1 = new C();
        a1.m1();
    }
}