package core_java.eight;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {
    public static void main(String[] args) {
        try
        {
            PrintWriter pw = new PrintWriter("output.txt");

            pw.println("Hello there");
            pw.println("My name is Bhavani Somanchi!");

            pw.close();
        }
        catch(FileNotFoundException exception)
        {
            System.out.println("Couldn't write to the file!");
        }
    }
}
