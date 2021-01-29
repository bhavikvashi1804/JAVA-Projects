package serializationdemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
    public static void main(String[] args) {

        FileInputStream fis;
        ObjectInputStream ois;

        try{
            fis = new FileInputStream("d://empDetails.ser");
            ois = new ObjectInputStream(fis);

            Employee e = (Employee) ois.readObject();

            System.out.println(e.id);
            System.out.println(e.name);
            System.out.println(e.salary);
            System.out.println(e.ssn);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
