package multithreading.sync.classlock;

public class DisplayMessage {

    synchronized public static void sayHello(String name){

        for (int i=1;i<10;i++){
            System.out.println("How are you? "+name);
        }

    }
}
