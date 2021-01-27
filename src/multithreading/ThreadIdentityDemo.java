package multithreading;

public class ThreadIdentityDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Current Thread Name: "+ Thread.currentThread().getName());

        MyThread1 t2 = new MyThread1();
        t2.start();
        System.out.println("Current Thread Name: "+ Thread.currentThread().getName());
        t2.join();

        System.out.println("Current Thread Name: "+ Thread.currentThread().getName());


        System.out.println("Thread Priority");
        threadPriorityDemo();
    }


    public static void threadPriorityDemo(){
        MyThread2 thread1 = new MyThread2();
        thread1.setName("Low priority thread");
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();

        MyThread2 thread2 = new MyThread2();
        thread2.setName("High priority thread");
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread2.start();
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

class  MyThread2 extends  Thread{
    @Override
    public void run() {
        try {
            System.out.println("Current Thread Name: "+ Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}