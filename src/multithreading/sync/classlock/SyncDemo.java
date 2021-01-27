package multithreading.sync.classlock;

public class SyncDemo {
    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();

        MyThread t1 = new MyThread("Bhavik");
        MyThread t2 = new MyThread("Raj");

        t1.start();
        t2.start();

    }
}
