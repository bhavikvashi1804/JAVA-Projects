package java8Features;

@FunctionalInterface
public interface Sum {

    void add(int x, int y);
}


class Program{
    public static void main(String[] args) {
        Sum s = (x,y)-> System.out.println(x+y);
        s.add(5,10);
    }
}
