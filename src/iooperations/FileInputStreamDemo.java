package iooperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args) {
        FileInputStream fileInputStream=  null;
        try{
            fileInputStream = new FileInputStream(new File("d://hello.txt"));
            System.out.println("File Opened");

            System.out.println("File Content");
            int i ;
            while( (i = fileInputStream.read()) !=-1){
                //end of the file = -1
                System.out.print((char) i);
            }

            System.out.println("\nFile read done");
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fileInputStream.close();
                System.out.println("File closed");
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
