package core_java.three;

import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age;
        char gender;

        System.out.println("Enter your age : ");
        age = keyboard.nextInt();
        System.out.println("enter your gender : ");
        gender = keyboard.next().charAt(0);

        if(age >= 19 && (gender == 'M' || gender == 'm'))
            System.out.println("You are eligible to join the fraternity");
        else
            System.out.println("You are not eligible to join the fraternity");

    }
}
