package generics;

import java.util.ArrayList;

public class WildcardParams {

    public void myMethod(ArrayList<? extends Thread> l){
        l.add(null);
        //l.add(5);
        //if ArrayList<?> then null values are allowed
    }


}

class  Test1{
    public static void main(String[] args) {
        WildcardParams wp = new WildcardParams();
        wp.myMethod(new ArrayList<Thread>());
    }
}
