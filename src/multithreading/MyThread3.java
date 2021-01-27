package multithreading;

public class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i =0;i<100;i++){
            System.out.println("Child Thread");
            Thread.yield();
            //it waits for main thread to finish
            //if we comment this then main thread and child thread will execute in parallel manner

        }
    }
}

class YieldDemo{
    public static void main(String[] args) {
        MyThread3 t = new MyThread3();
        t.start();

        for(int i=0;i<100;i++){
            System.out.println("Main Thread");
        }
    }
}
