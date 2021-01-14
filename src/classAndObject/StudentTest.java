package classAndObject;

public class StudentTest {

	public static void main(String[] args) {
		
		// 1. Creating a new Student object
		Student student1 = new Student ();
		
		// 2. Setting student state
		student1.id = 1000;
		student1.name = "Bhavik";
		student1.gender = "Male";
		
		// 3. update the profile using methods
		student1.updateProfile("Bhavik Vashi");
		

		System.out.println("Student ID: "+ student1.id);
		System.out.println("Student Name: "+ student1.name);
		System.out.println("Student Gender: "+ student1.gender);
	}
}
