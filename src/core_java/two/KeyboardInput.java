package core_java.two;

import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args) {
        //java.util.Scanner keyboard = new java.util.Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double realNumber;

        System.out.println("What is your name : ");
        name = keyboard.nextLine();

        System.out.println("What's your age : ");
        age = keyboard.nextInt();
        keyboard.nextLine(); //Consume the new line

        System.out.println("Enter a real number : ");
        realNumber = keyboard.nextDouble();
        keyboard.nextLine();

        realNumber *= 2;


        System.out.println("What city do you live in : ");
        city = keyboard.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("Age is : "+ age);
        System.out.println("City is : "+ city);
        System.out.println("Twice your number is : " + realNumber);

    }
}
