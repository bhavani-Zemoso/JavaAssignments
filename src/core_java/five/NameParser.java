package core_java.five;

import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your full name; The first name and the last name should have a space in between");
        String name = keyboard.nextLine();

        int space = name.indexOf(' ');
        String firstName = name.substring(0,space);
        String lastName = name.substring(space+1);

        System.out.println("First name is : " + firstName.toUpperCase());
        System.out.println("Last name is : " + lastName.toLowerCase());
    }
}
