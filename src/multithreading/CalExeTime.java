package multithreading;

public class CalExeTime{
    public static void main(String[] args) {

        long startTimeInMills = System.currentTimeMillis();
        MyThread t1 = new MyThread();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTimeInMills = System.currentTimeMillis();
        System.out.println("Time taken:(s)"+ ((endTimeInMills-startTimeInMills)/1000));

    }
}

class MyThread extends  Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
