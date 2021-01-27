package iooperations;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterDemo {
    public static void main(String[] args) throws Exception{
        FileWriter writer = new FileWriter("D:\\testout.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to javaTpoint.");
        buffer.newLine();
        buffer.write("Amazon");
        buffer.close();
        System.out.println("Success");
    }
}
