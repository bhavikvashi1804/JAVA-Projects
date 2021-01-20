package FlowControlStatements;

public class LabelledBlocksAndBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 20;
		
		l1:{
			System.out.println("Block Begins");
			if(x==20) {
				break l1;
			}
		}
	}

}
