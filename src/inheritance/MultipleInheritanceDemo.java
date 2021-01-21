package inheritance;


interface AnimalEat{
    void eat();
}

interface  AnimalTravel{
    void travel();
}

class MyAnimal implements  AnimalEat,AnimalTravel{

    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public void travel() {
        System.out.println("Animal is travellings");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        MyAnimal animal = new MyAnimal();
        animal.eat();
        animal.travel();
    }

    //this is comment
}
