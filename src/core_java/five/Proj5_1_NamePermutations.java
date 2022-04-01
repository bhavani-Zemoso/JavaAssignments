package core_java.five;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;

        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();

        final int NUM_NAMES = 5;

        for(int i = 0; i < NUM_NAMES; i++)
        {
            System.out.println("Enter a name : ");
            name = keyboard.nextLine();

            int indexOfSpace = name.indexOf(' ');

            firstNames.add(name.substring(0, indexOfSpace));
            lastNames.add(name.substring(indexOfSpace+1));
        }

        for(String firstName : firstNames)
        {
            for(String lastName : lastNames)
                System.out.println(firstName + " " + lastName);
        }
    }
}
