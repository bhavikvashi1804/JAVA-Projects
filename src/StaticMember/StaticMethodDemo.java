package StaticMember;

public class StaticMethodDemo {

	
	public static void Greet(String name) {
		System.out.println("Good morning, "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greet("Bhavik");
		StaticMethodDemo.Greet("Raj");

	}
	
	static {
		Greet("Welcome to all of you");
	}

}
