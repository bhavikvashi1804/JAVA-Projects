package multithreading;

public class SleepMethodDemo {

    public static void main(String[] args) throws InterruptedException {
        MultiThreaded1 mt1 = new MultiThreaded1();
        mt1.start();

        for(int i=0;i<=200;i++){
            System.out.print(i+" j\t");
            Thread.sleep(1000);
        }

    }
}

class MultiThreaded1 extends Thread{

    public  void  run() {
        for(int i=0;i<=200;i++){
            System.out.print(i+" i\t");
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}
