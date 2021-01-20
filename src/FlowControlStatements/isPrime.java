package Assignment;
import java.util.Scanner;

public class FlowStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        boolean isPrime = true;

        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("Given number "+number+" is a Prime Number");
        }
        else{
            System.out.println("Given number "+number+" is not a Prime Number");
        }
    }
}
