package synchronizationdemo.p1;

class Table{
    synchronized static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.print(n*i+ " ");
            try{
                Thread.sleep(400);
            }catch(Exception e){}
        }
        System.out.println();
    }
}

class MyThread1 extends Thread{
    public void run(){
        Table.printTable(1);
    }
}
class MyThread2 extends Thread{
    public void run(){
        Table.printTable(2);
    }
}
class MyThread3 extends Thread{
    public void run(){
        Table.printTable(3);
    }
}
class MyThread4 extends Thread{
    public void run(){
        Table.printTable(4);
    }
}

class TestSynchronization4{
    public static void main(String t[]){
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        MyThread3 t3=new MyThread3();
        MyThread4 t4=new MyThread4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}