package StringClassDemo;

public class ImmutableDemo {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		System.out.println("Before concat\t s1: "+s1+"\ts2: "+s2);
		
		String s3 = s1.concat(s2);
		
		System.out.println("After concat\t s1: "+s1+"\ts2: "+s2);
		System.out.println("s3: "+s3);
		
		
	}
}
