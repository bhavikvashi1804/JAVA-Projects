package operatorsDemo;

public class BitwiseOperator {
	
	public static void main(String[] args) {
		
		System.out.println("Bitwise Operator: AND &: both must be true");
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		
		
		System.out.println("Bitwise Operator: OR !: anyone must be true");
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);
		
		
		System.out.println("Bitwise Operator: XOR ^: both must be different");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		
		System.out.println(4&5); //4
		System.out.println(4|5); //5
		System.out.println(4^5); //1
		
		
		System.out.println(~10); //-11
		System.out.println(!true); //false
	}

}
