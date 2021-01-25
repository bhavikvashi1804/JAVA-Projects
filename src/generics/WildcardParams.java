package generics;

import java.util.ArrayList;

public class WildcardParams {

    public void myMethod(ArrayList<? extends Thread> l){
        l.add(null);
        //l.add(5);
        //if ArrayList<?> then null values are allowed
    }


    public void myMethod1(ArrayList<?  super B> l){
        //this list can accept wich is super class of B
        l.add(null);
        //l.add(5);
        //if ArrayList<?> then null values are allowed
    }
}

class A{

}

class  B extends  A{

}

class  Test1{
    public static void main(String[] args) {
        WildcardParams wp = new WildcardParams();
        wp.myMethod(new ArrayList<Thread>());

        wp.myMethod1(new ArrayList<A>());
    }
}
