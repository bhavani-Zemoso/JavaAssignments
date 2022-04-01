package core_java.eight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;
        int sum = 0;

        try
        {
            infile = new Scanner(new File("input.txt"));
            int input;

            while(infile.hasNext())
            {
                input = infile.nextInt();
                System.out.println(input);
                sum += input;
            }

            System.out.println("Sum is :" + sum);
            infile.close();
        }
        catch(FileNotFoundException exception)
        {
            System.out.println("Can't find file!");
            System.out.println(exception.getMessage());
        }
        catch(InputMismatchException exception)
        {
            System.out.println("Wrong type of input");
            //System.out.println(exception.getMessage());
        }
    }
}
