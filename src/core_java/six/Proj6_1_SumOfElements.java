package core_java.six;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int num;

        System.out.println("Enter an integer. Enter a negative number to exit");
        num = keyboard.nextInt();

        while(num >= 0)
        {
            numbers.add(num);

            System.out.println("Enter an integer. Enter a negative number to exit");
            num = keyboard.nextInt();
        }

        int sum = sumElements(numbers);
        System.out.println("Sum is : " + sum);
    }

    public static int sumElements(ArrayList<Integer> numbers)
    {
        int sum = 0;

        for(int num : numbers)
            sum += num;

        return sum;
    }
}
