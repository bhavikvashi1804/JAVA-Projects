package interfaces;

public class Honda implements  Car{

    @Override
    public void go() {
        System.out.println("Honda Go...");
    }

    @Override
    public void stop() {
        System.out.println("Honda Stop...");
    }
}
