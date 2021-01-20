package FlowControlStatements;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 1;
		
		switch(age) {
			case 1:
				System.out.println("Case 1");
				break;
			case 2:
				System.out.println("Case 2");
				break;
			case 3:
				System.out.println("Case 3");
				break;
			default:
				System.out.println("Not a number");
				break;
		}
		
		
		
		//Switch Fall Through
		int x = 2;
		
		switch(x) {
			case 1:
			case 2:
				System.out.println("Number 1 or 2");
				break;
			case 3:
				System.out.println("Number 3");
				break;
			default:
				System.out.println("Default");
				break;
		}

	}

}
