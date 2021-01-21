package abstractdemo;

public class Test {
    public static void main(String[] args) {
        ThreeSeries ts1 = new ThreeSeries();
        ts1.commonFunction();
        ts1.accelerate();

        FiveSeries fs1 = new FiveSeries();
        ts1.commonFunction();
        fs1.accelerate();
    }
}
