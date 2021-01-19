package dataTypesInJava;

public class ExplicitTypeCast {

	public static void main(String[] args) {
		
		
		int i = 100;
		byte b = (byte)i;
		System.out.println(b);
		//100
		
		int i1 = 97;
		char ch = (char)i1;
		System.out.println(ch);
		//a
		
		
		byte a = -50;
		byte h = 20;
		byte result = (byte)(a+h);
		System.out.println(result);
		//-30
		
		
		//explicit type casting beyond the range
		int y = 130;
		byte b1 = (byte)y;
		System.out.println(b1);
		//value will be cal using the circle
		// 127 +ve then -128, -127, -126
		//so answer is -126
		
		
		int m = 612;
		//byte total number: 256: -128 to 127
		// rounds = 612/ 256 = 2.39 = 2
		// left numbers =  612 - (256*2) = 612-512 = 100
		byte n = (byte)m;
		//100
		char ch1 = (char)n;
		System.out.println(ch1);
		//d
		
	}
}
