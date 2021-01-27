package serializationdemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {

        FileOutputStream fos;
        ObjectOutputStream oos;

        try{
            fos = new FileOutputStream("d://empDetails.ser");
            oos = new ObjectOutputStream(fos);

            Employee e1 = new Employee(101,"Bhavik",1000,12345);
            oos.writeObject(e1);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
