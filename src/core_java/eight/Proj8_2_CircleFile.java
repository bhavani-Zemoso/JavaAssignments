package core_java.eight;

import core_java.seven.Proj7_3_Circle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {

        ArrayList<Proj7_3_Circle> circles = new ArrayList<>();

        readFromFile(circles);
        writeToFile(circles);

    }

    public static void readFromFile(ArrayList<Proj7_3_Circle> circles)
    {
        Scanner dataFile;
        double radius;

        try
        {
            dataFile = new Scanner(new File("circle_data.txt"));


            while(dataFile.hasNext())
            {
                radius = dataFile.nextDouble();
                circles.add(new Proj7_3_Circle(radius));
            }

            dataFile.close();
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    public static void writeToFile(ArrayList<Proj7_3_Circle> circles)
    {
        PrintWriter pw;
        try
        {
            pw = new PrintWriter("circles_output.txt");

            for(Proj7_3_Circle circle : circles)
            {
                String sentence = "A circle has a radius of " + circle.getRadius() +
                        " , an area of " + String.format("%.2f", circle.area()) +
                        " and a circumference of " + String.format("%.2f", circle.circumference()) + '\n';

                System.out.println(sentence);
                pw.println(sentence);
            }

            pw.close();
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(exception.getMessage());
        }

    }
}
