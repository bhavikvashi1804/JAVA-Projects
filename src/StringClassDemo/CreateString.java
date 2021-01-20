package StringClassDemo;

public class CreateString {
	
	public static void main(String[] args) {
		
		//String literal
		String s1 = "Raj";
		System.out.println(s1);
		
		//using constructor
		String s2 = new String("Bhavik");
		System.out.println(s2);
		
		
		char c[] = {'Y','a','s','h'};
		String s3 = new String(c);
		System.out.println(s3);
		
		
		byte b[] = {65,66,67};
		String s4 = new String(b);
		System.out.println(s4);
	}
}
