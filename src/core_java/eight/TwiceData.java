package core_java.eight;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner numbersFile;
        PrintWriter pw;

        try
        {
            numbersFile = new Scanner(new File("nums.txt"));
            pw = new PrintWriter("twice_nums.txt");

            int num;

            while(numbersFile.hasNext())
            {
                num = numbersFile.nextInt();
                num *= 2;
                pw.println(num);
            }

            numbersFile.close();
            pw.close();
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
