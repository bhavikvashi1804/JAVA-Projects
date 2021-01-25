package collectionsdemo.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new IdentityHashMap<>();
        Map<Integer,String> map1 = new HashMap<>();
        Integer i1 = new Integer(10);
        Integer i2= new Integer(10);

        map.put(i1,"Bhavik");
        map.put(i2,"Raj");

        map1.put(i1,"Bhavik");
        map1.put(i2,"Raj");


        System.out.println(map);
        //IdentityHashMap: keep the duplicate keys
        System.out.println(map1);
        //HashMap: remove the duplicate key and override the latest value
    }
}
