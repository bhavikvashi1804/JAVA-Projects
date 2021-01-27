package java8Features.methodrefdemo;

public class MethodRef {

    static public void myMethod(){
        for(int i=0;i<10;i++){
            System.out.println("Child Method");
        }
    }

    public static void main(String[] args) {

        Runnable r = MethodRef::myMethod;
        Thread t = new Thread(r);
        t.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Method");
        }

    }
}
