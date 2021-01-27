package java8Features.lambdasbasics;

import java.io.IOException;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThreadDemo{
    public static void main(String[] args) {
        Runnable r1 = new MyThread();
        Thread thread = new Thread(r1);
        thread.start();

        for (int i=0;i<10;i++){
            System.out.println("Main Thread");
        }

    }
}