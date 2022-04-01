package core_java.eight;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteNames {
    public static void main(String[] args) {
        String name;
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter a name. To exit type exit!");
        name = keyboard.nextLine();

        while(!(name.equalsIgnoreCase("exit")))
        {
            names.add(name);

            System.out.println("Enter a name. To exit type exit!");
            name = keyboard.nextLine();
        }

        addNamesToFile(names);

    }

    public static void addNamesToFile(ArrayList<String> names)
    {
        try
        {
            PrintWriter pw = new PrintWriter("names.txt");

            for(String name : names)
                pw.println(name);

            pw.close();
        }
        catch (FileNotFoundException exception)
        {
            System.out.println("Couldn't write to file!");
        }
    }
}
