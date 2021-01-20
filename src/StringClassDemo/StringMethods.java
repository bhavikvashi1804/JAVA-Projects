package StringClassDemo;

public class StringMethods {
	public static void main(String[] args) {
		String s1 = "Bhavik Vashi";
		
		System.out.println(s1.length());//12
		System.out.println(s1.indexOf('V'));//7
		System.out.println(s1.charAt(3)); //v
		
		System.out.println(s1.toLowerCase()); // bhavik vashi
		System.out.println(s1.toUpperCase()); // BHAVIK VASHI
		System.out.println(s1.substring(3));//vik Vashi
		System.out.println(s1.substring(3,6));//vik
		
		
		String s2 = " Raj Patel ";
		System.out.println(s2.length());//11
		String s3 = s2.trim(); //s3="Raj Patel";
		System.out.println(s3.length());//9
		
		
		String s4 = "Hello World";
		String[] result = s4.split(" ");
		for(String x : result){
			System.out.println(x);
		}
		
		String s5 = s4.replace('l', 'm');
		System.out.println(s5); //Hemmo Wormd
		
		String s6 = s4.replace("Hello","Good Morning");
		System.out.println(s6); // Good Morning World
	}

}
