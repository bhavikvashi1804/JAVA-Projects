package ArrayDemo;

public class CreateArray {
	public static void main(String[] args) {
	
		int a[] = {10,20,30,40,50};
		
		int array1[];
		array1 = new int[5];
		
		
		int array2[] = new int[5];
		array2[0] = 1;
		array2[1] = new Integer(2);
		array2[2] = 3;
		array2[3] = 4;
		array2[4] = 5;
		
		//array2[5] = 7;
		//array index out of bound exception
		
		
		System.out.println("Before change");
		//print the array using for loop
		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i]);
		}
		
		
		//change the value of array element
		array2[2] = 30;
		

		System.out.println("After change");
		//print the array using foreach loop
		for(int x: array2) {
			System.out.println(x);
		}
		//you can not go in backward direction using foreach loop
		
		
	}
}
