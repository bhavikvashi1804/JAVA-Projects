package generics;

public class AnyRunnable <T extends  Runnable>{
}


class Test{
    public static void main(String[] args) {
        AnyRunnable<Thread> t = new AnyRunnable<>();
        //thread class implements the Runnable
        //so it accepts at here
    }
}
