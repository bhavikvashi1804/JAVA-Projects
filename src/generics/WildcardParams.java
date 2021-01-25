package generics;

import java.util.ArrayList;

public class WildcardParams {

    public void myMethod(ArrayList<?> l){
        l.add(null);
        //l.add(5);
        //if ArrayList<?> then null values are allowed
    }
}
