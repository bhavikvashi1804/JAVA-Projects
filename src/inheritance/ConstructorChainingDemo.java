package inheritance;

public class ConstructorChainingDemo {
    public static void main(String[] args) {

        ChildClass c1 = new ChildClass();

    }
}

class SuperClass{
    int x;

    public  SuperClass(){
        //this keyword is used in constructor to call the other constructor of same class

        System.out.println("Super Class: No args");
    }

    public  SuperClass(int x){
        this();
        this.x = x;
        System.out.println("Super Class: With args");
    }
}

class ChildClass extends SuperClass{

    public ChildClass(){
        this(10);
        System.out.println("Child Class: No args");
    }

    public  ChildClass(int x){
        super(x);
        System.out.println("Child Class: With args");
    }
}