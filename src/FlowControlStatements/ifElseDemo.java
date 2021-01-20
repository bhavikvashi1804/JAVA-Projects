package FlowControlStatements;

public class ifElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 23;
		
		if(age <= 12) {
			System.out.println("Child");
		}
		else if(age>= 13 && age<= 18) {
			System.out.println("Teenager");
		}
		else if(age>= 19 && age <= 64 ) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior Citizen");
			
		}
	}

}
