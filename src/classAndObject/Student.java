package classAndObject;

public class Student {
	
	//variable declaration
	int id;
	String name;
	String gender;
	
	//method definitions
	boolean updateProfile(String newName) {
		name = newName;
		return true;
	}

	void display() {
		System.out.println("Student Info");
		System.out.println("Student ID: "+id);
		System.out.println("Student Name: "+name);
		System.out.println("Student Gender: "+gender);
	}
	
	public static void main(String[] args) {
		
		
		//primitive type
		//declare a variable and assign the value (initialize)
		int y = 100;
		//declare a variable
		int x;
		
		//assign the value to a variable: Literal
		x = 100;
		
		//assign the value to a variable: Expression
		x = x + y;
		
		
		
		//reference type
		Student s1 = new Student();
		s1.id = 1001;
		s1.name = "Bhavik Vashi";
		s1.gender = "Male";
		
		//method call
		s1.display();
		
	}
}
