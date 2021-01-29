package collectionsdemo.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();

        map.put("Bhavik",80);
        map.put("Raj",81);
        map.put("Yash",70);
        map.put("Dhruvik",89);
        map.put("Meet",80);

        Set<String> keys = map.keySet();
        System.out.println("Keys: "+ keys);

        Collection<Integer> values = map.values();
        System.out.println("Values: "+ values);

        for(String key:keys){
            System.out.println("Key: "+key+"\tValue: "+map.get(key));
        }
    }
}
