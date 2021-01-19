package dataTypesInJava;

public class ImplicitCast {

	public static void main(String[] args) {
		
		byte b = 100;
		int i = b;
		System.out.println(i);
		//100
		
		long l = i;
		System.out.println(l);
		//100
		
		char ch = 'A';
		int x = ch;
		System.out.println(x);
		//65
	}

}
