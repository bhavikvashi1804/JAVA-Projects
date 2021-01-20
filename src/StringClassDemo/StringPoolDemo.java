package StringClassDemo;

public class StringPoolDemo {
	
	
	public static void main(String[] args) {
		User user1 = new User(1,"Bhavik");
		User user2 = new User(2,"Bhavik");
		
		System.out.println(user1);
		System.out.println(user2);
		
		
		String s1="Raj";
		String s2="Raj";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
	}

}


