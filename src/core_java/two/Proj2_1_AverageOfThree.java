package core_java.two;

import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        double number1, number2, number3;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter three numbers");
        number1 = keyboard.nextDouble();
        number2 = keyboard.nextDouble();
        number3 = keyboard.nextDouble();
        keyboard.nextLine();

        double average = (number1 + number2 + number3) / 3.0;

        System.out.println("The average of three numbers is : " + average);
    }
}
