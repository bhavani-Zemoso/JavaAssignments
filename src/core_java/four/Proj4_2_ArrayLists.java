package core_java.four;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean stop = false;
        double num;

        ArrayList<Double> numbers = new ArrayList<>();

        System.out.println("Enter as many numbers as you want. To stop enter a negative number.");

        System.out.println("Enter a number : ");
        num = keyboard.nextDouble();

        while(num >= 0)
        {
            numbers.add(num);

            System.out.println("Enter a number : ");
            num = keyboard.nextDouble();
        }

        for(int i = numbers.size()-1; i >= 0; i--)
            System.out.print(numbers.get(i) + "\t");
    }
}
