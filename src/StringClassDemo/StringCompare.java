package StringClassDemo;

public class StringCompare {
	
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "ABC";
		
		
		//using memory location
		System.out.println(s1==s3);
		System.out.println(s1==s2);
		
		//using method, compare using content inside the string not the memory location
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		
		
		String s4 = "Bhavik";
		String s5 = new String("Bhavik");
		//here you used new keyword for string so JVM create a new location
		System.out.println(s4==s5); //here == fails 
		System.out.println(s4.equals(s5)); // here equals method works //equals derive from Object class
		
	}

}
