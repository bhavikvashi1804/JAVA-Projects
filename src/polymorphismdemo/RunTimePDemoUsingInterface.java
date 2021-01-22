package polymorphismdemo;

public class RunTimePDemoUsingInterface {
    public static void main(String[] args) {
        Laptop apple1 = new Apple();
        apple1.start();
        apple1.shutdown();

        Laptop hp1 = new HP();
        hp1.start();
        hp1.shutdown();
    }
}

interface  Laptop{
    void start();
    void shutdown();
}

class Apple implements  Laptop{
    @Override
    public void start() {
        System.out.println("Apple Laptop is starting...");
    }

    @Override
    public void shutdown() {
        System.out.println("Apple Laptop : Shutdown");
    }
}

class HP implements  Laptop{
    @Override
    public void start() {
        System.out.println("HP Laptop is starting...");
    }

    @Override
    public void shutdown() {
        System.out.println("HP Laptop : Shutdown");
    }
}