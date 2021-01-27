package multithreading;

public class ThreadIdentityDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Current Thread Name: "+ Thread.currentThread().getName());

        MyThread1 t2 = new MyThread1();
        t2.start();
        System.out.println("Current Thread Name: "+ Thread.currentThread().getName());
        t2.join();

        System.out.println("Current Thread Name: "+ Thread.currentThread().getName());
    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        try {
            //to change the Thread Name
            currentThread().setName("MyThread");
            System.out.println("Current Thread Name: "+ Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}