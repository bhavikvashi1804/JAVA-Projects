package multithreading.sync;

public class DisplayMessage {

    synchronized public void sayHello(String name){

        for (int i=1;i<10;i++){
            System.out.println("How are you? "+name);
        }

    }
}
