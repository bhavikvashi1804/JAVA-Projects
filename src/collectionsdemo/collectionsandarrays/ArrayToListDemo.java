package collectionsdemo.collectionsandarrays;

import java.util.Arrays;
import java.util.List;

public class ArrayToListDemo {

    public static void main(String[] args) {
        String[] array1 = {"Bhavik","Atul","Yash","Apple","Raj"};
        List<String> list = Arrays.asList(array1);
        System.out.println(list);
    }
}
