package NonStaticMember;

public class ThisDemo {

	int x;
	
	ThisDemo(){
		System.out.println(this);
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
		ThisDemo d1 = new ThisDemo();
		ThisDemo d2 = new ThisDemo();
	}
}
