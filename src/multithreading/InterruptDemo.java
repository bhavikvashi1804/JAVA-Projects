package multithreading;

public class InterruptDemo {

    public static void main(String[] args) {
        MyThread001 t = new MyThread001();
        t.start();

        t.interrupt();

        System.out.println("End of main method");
    }
}

class MyThread001 extends Thread{
    @Override
    public void run() {
        try {
            for(int i=0;i<=10;i++){
                System.out.println("I am lazy thread");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Got Interrupted");
        }
    }
}