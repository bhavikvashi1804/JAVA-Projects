package operatorsDemo;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		System.out.println(a);
		a = 20;
		System.out.println(a);
		
		int b = a;
		System.out.println(b);
		
		 
		//compound assignment 
		//used with any Arithmetic Operator
		int c  = 10;
		c += 20; // c = c + 20;
		System.out.println(c); //30
		
		
		int d = 10;
		d -= 20; // d = d - 20;
		System.out.println(d); //-10

	}

}
