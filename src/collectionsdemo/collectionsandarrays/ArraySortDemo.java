package collectionsdemo.collectionsandarrays;

import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] a = {40,10,7,15};

        System.out.println("Before sort:");
        for(int x: a){
            System.out.print(x+ " ");
        }
        System.out.println();

        Arrays.sort(a);

        System.out.println("After sort:");
        for(int x: a){
            System.out.print(x+ " ");
        }
        System.out.println();

    }
}
