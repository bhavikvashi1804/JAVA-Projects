package multithreading;

public class MultiThreadDemo {

    public static void main(String[] args) {
        MultiThreaded mt1 = new MultiThreaded();
        mt1.start();

        for(int i=0;i<=200;i++){
            System.out.print(i+" j\t");
        }

    }

}

class MultiThreaded extends Thread{

    public  void  run(){
        for(int i=0;i<=200;i++){
            System.out.print(i+" i\t");
        }

    }
}
