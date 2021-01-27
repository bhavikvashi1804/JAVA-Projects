package synchronizationdemo.p1;

class Table{

    synchronized void printTable(int n){
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

    Table t;
    MyThread1(Table t){
        this.t = t;
    }

    public void run(){
        t.printTable(1);
    }
}

class MyThread2 extends Thread{

    Table t;
    MyThread2(Table t){
        this.t = t;
    }

    public void run(){
        t.printTable(2);
    }
}

class MyThread3 extends Thread{

    Table t;
    MyThread3(Table t){
        this.t = t;
    }

    public void run(){
        t.printTable(3);
    }
}
class MyThread4 extends Thread{

    Table t;
    MyThread4(Table t){
        this.t = t;
    }

    public void run(){
        t.printTable(4);
    }
}

class TestSynchronization4{
    public static void main(String t[]){
        Table table= new Table();
        Table table1 = new Table();
        MyThread1 t1=new MyThread1(table);
        MyThread2 t2=new MyThread2(table);
        MyThread3 t3=new MyThread3(table1);
        MyThread4 t4=new MyThread4(table1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}