package StaticMember;

public class StaticBlockDemo {
	
	
	public static void main(String[] args) {
		System.out.println("This is main");
	}
	
	
	static {
		System.out.println("This is static block");
	}
	

	static {
		System.out.println("This is static block 1");
	}
	

	static {
		System.out.println("This is static block 2");
	}
	
	

}
