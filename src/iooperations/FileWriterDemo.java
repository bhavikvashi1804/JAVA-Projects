package iooperations;

import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

public class FileWriterDemo {
    public static void main(String[] args) {
        try{

            FileWriter fileWriter = new FileWriter("d://newFile.txt");

            String fileContent = "Hello, \nMy name is Bhavik";

            fileWriter.write(fileContent);

            fileWriter.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
