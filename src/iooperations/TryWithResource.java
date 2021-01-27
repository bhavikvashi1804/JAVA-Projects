package iooperations;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResource {
    public static void main(String[] args) {
        try(
        FileReader fr=new FileReader("D:\\testout.txt");
        BufferedReader br=new BufferedReader(fr);){
            String line;
            while( (line=br.readLine()) != null){
                System.out.println(line);
            }
            //br.close();
            //fr.close();
            //jvm automatically close it
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
