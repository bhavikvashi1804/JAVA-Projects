package annotationdemo;

public class OverrideDemo {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        amazon.display();

        Electronics electronics= new Electronics();
        electronics.display();
    }
}

class Amazon{
    public void display(){
        System.out.println("Amazon");
    }
}

class Electronics extends  Amazon{
    @Override
    public void display(){
        System.out.println("TV/Computer/Mobile");
    }
}
