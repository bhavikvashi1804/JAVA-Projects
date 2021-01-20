package FlowControlStatements;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print the number and break the loop if number is divided by 5
		
		for(int i=1;i<21;i++) {
			if(i%5==0) {
				break;
			}
			System.out.println(i);
		}
	}

}
