package multithreading;

public class ThreadCreateDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("Process the checks");
    }

    public static void main(String[] args) {
        ThreadCreateDemo tcd = new ThreadCreateDemo();
        Thread t = new Thread(tcd);
        t.start();
    }
}
