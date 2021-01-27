package multithreading.sync;

public class SyncDemo {
    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();

        MyThread t1 = new MyThread(dm,"Bhavik");
        MyThread t2 = new MyThread(dm,"Raj");

        t1.start();
        t2.start();

    }
}
