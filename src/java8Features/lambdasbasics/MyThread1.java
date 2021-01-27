package java8Features.lambdasbasics;

public class MyThread1 {
    public static void main(String[] args) {
        Runnable r = ()->{
            for(int i=0;i<10;i++){
                System.out.println("Child method");
            }
        };

        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main method");
        }

    }
}
