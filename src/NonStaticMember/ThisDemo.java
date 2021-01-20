package NonStaticMember;

public class ThisDemo {

	static Demo obj = new Demo();
	
	int x;
	
	static {
		System.out.println(ThisDemo.obj);
		ThisDemo.Init();
	}
	
	ThisDemo(){
		System.out.println(this);
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
		ThisDemo d1 = new ThisDemo();
		ThisDemo d2 = new ThisDemo();
	}
	
	
	public static void Init() {
		ThisDemo.obj = new Demo();
	}
}
