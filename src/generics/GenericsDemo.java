package generics;

public class GenericsDemo {
    public static void main(String args[]){
        MyGen<Integer> m=new MyGen<Integer>();
        m.add(2);
        //m.add("vivek");//Compile time error
        System.out.println(m.get());

        m.displayObjectDetails();
    }
}

class MyGen<T>{
    T obj;
    public void add(T obj){this.obj=obj;}
    public T get(){return obj;}
    public void displayObjectDetails(){
        System.out.println("The type of object:"+obj.getClass().getName());
    }
}