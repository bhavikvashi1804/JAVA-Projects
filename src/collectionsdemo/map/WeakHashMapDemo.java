package collectionsdemo.map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) throws InterruptedException {
        Map<User,String> hashMap = new WeakHashMap<User,String>();

        User u = new User();
        hashMap.put(u,"Tom");
        System.out.println(hashMap);

        u = null;
        System.gc();
        Thread.sleep(5000);

        System.out.println(hashMap);
    }
}
class  User{
    @Override
    public String toString() {
        return "user";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize called");
    }
}