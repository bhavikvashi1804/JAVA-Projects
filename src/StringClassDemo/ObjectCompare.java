package StringClassDemo;

public class ObjectCompare {
	
	public static void main(String[] args) {
		User user1 = new User(1,"Bhavik");
		User user2 = new User(2,"Bhavik");
		User user3 = new User(1,"Bhavik");
		
		
		//memory location
		System.out.println(user1 == user2);
		System.out.println(user1 == user3);
		
		System.out.println(user1.equals(user2));
		System.out.println(user1.equals(user3));
	}

}

