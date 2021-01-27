package multithreading;

public class SingleThreadDemo {

    public static void main(String[] args) {

        SingleThreadDemo std = new SingleThreadDemo();
        std.printNumber();

        for(int i=0;i<=200;i++){
            System.out.print(i+" j\t");
        }
        System.out.println();

    }

    void printNumber(){
        for(int i=0;i<=200;i++){
            System.out.print(i+" i\t");
        }
        System.out.println();
    }
}
