package finaldemo;

//public class B extends  A{
//}
//gives error

public class B {

    final void run(){
        System.out.println("Run...");
    }

    public static void main(String[] args) {
        final float PI = 3.14f;

        //PI = 3.144f;
        //error
    }

}

class C extends B{

    /*
    @Override
    void run(){

    }
    */
    //final method can't be override

}
