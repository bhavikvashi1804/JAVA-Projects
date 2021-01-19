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
	}
}
