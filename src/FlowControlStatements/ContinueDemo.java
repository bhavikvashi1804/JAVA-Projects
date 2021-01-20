package FlowControlStatements;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//skip the 5 multiple from 1 to 20
		for(int i=1;i<=20;i++) {
			if(i%5==0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
