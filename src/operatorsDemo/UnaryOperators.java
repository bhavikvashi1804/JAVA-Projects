package operatorsDemo;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		
		System.out.println("--------------------");
		
		System.out.println("Pre-Increment");
		System.out.println("Value before the Pre-Increment");
		System.out.println(a);
		System.out.println("Value at the Statement of Pre-Increment");
		System.out.println(++a);
		System.out.println("Value after the Pre-Increment");
		System.out.println(a);
		
		
		int b = 10;
		System.out.println("Post-Increment");
		System.out.println("Value before the Post-Increment");
		System.out.println(b);
		System.out.println("Value at the Statement of Post-Increment");
		System.out.println(b++);
		System.out.println("Value after the Post-Increment");
		System.out.println(b);
		
		
		System.out.println("--------------------");
		int c = 10;
		System.out.println("Pre-Decrement");
		System.out.println("Value before the Pre-Decrement");
		System.out.println(c);
		System.out.println("Value at the Statement of Pre-Decrement");
		System.out.println(--c);
		System.out.println("Value after the Pre-Decrement");
		System.out.println(c);
		
		
		int d = 10;
		System.out.println("Post-Decrement");
		System.out.println("Value before the Post-Decrement");
		System.out.println(d);
		System.out.println("Value at the Statement of Post-Decrement");
		System.out.println(--d);
		System.out.println("Value after the Post-Decrement");
		System.out.println(d);

	}

}
