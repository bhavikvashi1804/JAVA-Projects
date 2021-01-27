package java8Features.methodrefdemo;

public interface MyInterface {
    void myMethod(int i);
}

class Test{

    public void method1(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        //lambda expression
        MyInterface mf = (i)->System.out.println(i);
        mf.myMethod(10);

        //Instance method ref
        Test test = new Test();
        MyInterface mf1 = test::method1;
        mf1.myMethod(20);
    }
}
