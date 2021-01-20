package NonStaticMember;

public class NonStaticMemberDemo {
	
	static {
		System.out.println("Inside static block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		
		Student s1 = new Student();
		s1.display();
		
		
		Student s2 = new Student("Bhavik",23);
		s2.display();
		
	}
}


class Student{
	String name;
	int age;
	
	
	//non-static block
	{
		System.out.println("Inside non-static block");
	}
	
	Student(){
		System.out.println("Default Constructor");
	}
	
	Student(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("Parameterized Constructor");
	}
	
	public void display() {
		System.out.println("Student Name: "+name);
		System.out.println("Student Age: "+age);
	}
}
