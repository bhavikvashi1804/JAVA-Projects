package java8Features.lambdasbasics;

public class MyThread2 {
    public static void main(String[] args) {

        Thread t = new Thread(()-> {
            for(int i=0;i<10;i++) {
                System.out.println("Child method");
            }
        });

        t.start();

        for(int i=0;i<10;i++){
            System.out.println("Main method");
        }

    }
}
