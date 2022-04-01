package core_java.eight;

import core_java.seven.Rectangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {
        Scanner rectangleFile;

        ArrayList<Rectangle> rectangles = new ArrayList<>();
        double length, width;
        try
        {
            rectangleFile = new Scanner(new File("rectangle_data.txt"));

            while(rectangleFile.hasNext())
            {
                length = rectangleFile.nextDouble();
                width = rectangleFile.nextDouble();
                rectangles.add(new Rectangle(length, width));
            }

            rectangleFile.close();

            printDetails(rectangles);

        }
        catch(FileNotFoundException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    public static void printDetails(ArrayList<Rectangle> rectangles)
    {
        for(Rectangle rectangle : rectangles)
        {
            System.out.println("A rectangle has a length of " + rectangle.getLength() +
                    " and a width of " + rectangle.getWidth() + ".");
            System.out.println("It has an area of " + String.format("%.3f", rectangle.area()) +
                    " and a perimeter of " + String.format("%.3f", rectangle.perimeter()));

            System.out.println();
        }

    }
}
