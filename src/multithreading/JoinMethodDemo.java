package multithreading;

import java.util.Scanner;

public class JoinMethodDemo extends Thread{

    static int n,sum =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sum of N Numbers");
        System.out.println("Enter a value");
        n = sc.nextInt();

        JoinMethodDemo joinMethodDemo = new JoinMethodDemo();
        joinMethodDemo.start();

        try {
            joinMethodDemo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //we do not want below line to execute untill run finish
        System.out.println("Sum of First "+n+ " numbers "+sum);
    }

    public void run(){
        for(int i=0;i<n;i++){
            sum += i;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


