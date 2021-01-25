package collectionsdemo.list;

import java.util.Random;

public class RandomClassDemo {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt();
        System.out.println(x);

        int y = random.nextInt(100);
        System.out.println(y);
    }
}
