package concepts;
import java.util.Scanner;

public class MaxOutOf3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 3 numbers");
        int[] array = new int[3];

        for(int i=0;i<3;i++){
            array[i] = sc.nextInt();
        }

        if(array[0]>array[1] && array[0]>array[2]){
            System.out.println(array[0]);
        }
        else if(array[1] > array[2]){
            System.out.println(array[1]);
        }
        else{
            System.out.println(array[2]);
        }
    }
}


