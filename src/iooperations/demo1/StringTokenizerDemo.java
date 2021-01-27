package iooperations.demo1;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String s = "Good morning, My name is Bhavik";
        StringTokenizer st = new StringTokenizer(s,", ",true);

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
