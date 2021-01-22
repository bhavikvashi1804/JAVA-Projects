package polymorphismdemo;

public class CompileTimePDemo {

    public static void main(String[] args) {

        System.out.println(add(10,20));
        System.out.println(add(10.25,20.25));
        System.out.println(add(10,20,30));
    }

    public static int add(int x,int y){
        return x+y;
    }

    /*
    public static double add(int x,int y){

    }
    */


    public static int add(int x, int y, int z){
        return x+y+z;
    }

    public static double add(double x, double y){
        return  x+y;
    }
}
