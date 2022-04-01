package core_java.four;

import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int arrayOfIntegers[] = new int[5];

        System.out.println("Enter five numbers : ");
        for(int i = 0; i < arrayOfIntegers.length; i++)
        {
            System.out.println("Enter an integer : ");
            arrayOfIntegers[i] = keyboard.nextInt();
        }

        for(int num : arrayOfIntegers)
            System.out.println("Result is : " + (num * 2));
    }
}
