package dataTypesInJava;

public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//// Numbers
		byte a = -50;
		//byte a1 = 140;
		//type mismatch can't convert from int to byte
		//byte only holds from -128 to 127
		
		
		short b = 150;
		
		int c = 10000;
		
		long d = 100000;
		
		
		
		//characters
		char myChar = 'B';
		
		
		//decimal values
		//float f = 1.23;
		//error: can't convert from double to float
		//so float can be written with f suffix
		float f = 1.23f;
		double g = 12345.689;
		
		
		
		//boolean
		boolean isValid = true;
		boolean isValid1 = false;
		
		
		// + always expects int
		byte b1 = 10;
		byte b2 = 10;
		
		//byte result = b1 + b2;
		int result = (b1+b2);
		
	}

}
