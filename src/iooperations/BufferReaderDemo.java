package iooperations;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderDemo {
    public static void main(String[] args) throws Exception {
        readInByte();
        readInString();
    }

    public static void readInByte() throws  Exception{

        FileReader fr=new FileReader("D:\\testout.txt");
        BufferedReader br=new BufferedReader(fr);

        int i;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }
        System.out.println();
        br.close();
        fr.close();

    }

    public static void readInString() throws  Exception{
        FileReader fr=new FileReader("D:\\testout.txt");
        BufferedReader br=new BufferedReader(fr);

        String line;
        while( (line=br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
        fr.close();
    }
}
