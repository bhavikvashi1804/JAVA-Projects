package NonStaticMember;

public class Demo {
	
	
	static Demo d1;
	
	static {
		
		System.out.println(Demo.d1);
		 Demo.d1= new Demo();
	}
	
	
	public static void main(String[] args) {
		System.out.println(Demo.d1);
	}

}
