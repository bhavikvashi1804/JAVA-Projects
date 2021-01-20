package StaticMember;

public class StaticVariableDemo {
	
	static int number = 10;
	//if you do not assign the value then default value is 0
	
	public static void main(String[] args) {
		System.out.println(number);
		System.out.println(StaticVariableDemo.number);
	}

}
