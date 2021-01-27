package java8Features.methodrefdemo;

interface  MyInterface1{
    Bike get(String s);
}

class Bike{
    String name;

    public Bike(String s){
        this.name = s;
    }
}

public class ConstructorMapDemo {
    public static void main(String[] args) {

        MyInterface1 mf1= (s) -> new Bike(s);
        mf1.get("using lambdas");


        MyInterface1 mf2 = Bike::new;
        mf2.get("using constructor mapping");


    }
}




