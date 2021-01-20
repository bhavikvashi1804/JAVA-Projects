package StringClassDemo;

public class StringBufferDemo {
	public static void main(String[] args) {
	
		//mutable
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		
		sb1.append("All the power is with in you.");
		sb1.append("You can do anything and everything.");
		
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		
		System.out.println(sb1.charAt(10)); //w
		
		StringBuffer sb2 = new StringBuffer("abcde");
		System.out.println(sb2.reverse()); //edcba
		
		
		System.out.println(sb1.insert(10, "XYZ"));
		//All the poXYZwer is with in you.You can do anything and everything.
		
		System.out.println(sb1.delete(10, 13));
		//All the power is with in you.You can do anything and everything.
	} 
}
