package StringClassDemo;

public class StringAndWrapperTypes {
	
	public static void main(String[] args) {
		
		Product p1 = new Product(1,"iPhone 12");
		System.out.println(p1);
		//it prints the object ref. not value
		
		String s = "123";
		Integer i= new Integer(456);
		System.out.println(s);
		//for string class it prints the value inside the string in sop
		System.out.println(i);
		
		
		
	}

}


class Product{
	
	int id;
	String name;
	
	Product(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	
}