package collectionsdemo.collectionsandarrays;

import java.util.Arrays;

public class ArraySortDemo1 {
    public static void main(String[] args) {
        String[] array1 = {"Bhavik","Atul","Yash","Apple","Raj"};

        Arrays.sort(array1);

        System.out.println("After sort:");
        for(String x: array1){
            System.out.print(x+ " ");
        }


        String[] array2 = {"Bhavik","Atul","Yash","Apple","Raj"};
        Arrays.sort(array2, new MyComparator());
        System.out.println("\nUsing own Comparator:");
        for(String x: array2){
            System.out.print(x+ " ");
        }
    }
}
