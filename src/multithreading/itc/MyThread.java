package multithreading.itc;

public class MyThread extends  Thread{

    int total = 0;

    @Override
    public void run() {
        System.out.println("Child Thread is cal the sum:");
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                total += i;
            }
            this.notify();
        }
    }
}
