package core_java.two;

import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter adjective1 : ");
        String adjective1 = keyboard.nextLine();

        System.out.println("Enter a girl's name : ");
        String girlName = keyboard.nextLine();

        System.out.println("Enter adjective2 : ");
        String adjective2 = keyboard.nextLine();

        System.out.println("Enter occupation1 : ");
        String occupation1 = keyboard.nextLine();

        System.out.println("Enter a place : ");
        String place = keyboard.nextLine();

        System.out.println("Enter a clothing : ");
        String clothing = keyboard.nextLine();

        System.out.println("Enter a hobby : ");
        String hobby = keyboard.nextLine();

        System.out.println("Enter adjective3 : ");
        String adjective3 = keyboard.nextLine();

        System.out.println("Enter occupation2 : ");
        String occupation2 = keyboard.nextLine();

        System.out.println("Enter a boy's name : ");
        String boyName = keyboard.nextLine();

        System.out.println("Enter a man's name : ");
        String manName = keyboard.nextLine();

        String sentence1 = "There once was a " + adjective1
                + " girl named " + girlName
                + ", who was a " + adjective2
                + " " + occupation1
                + " in the kingdom of " + place
                + ".";

        String sentence2 = "She loved to wear " + clothing
                + " and to " + hobby
                + ".";

        String sentence3 = "She wanted to marry the " + adjective3
                + " " + occupation2
                + " named " + boyName
                + " but her father, King " + manName
                + " forbid her from seeing him.";

        System.out.println(sentence1);
        System.out.println(sentence2);
        System.out.print(sentence3);
    }
}
