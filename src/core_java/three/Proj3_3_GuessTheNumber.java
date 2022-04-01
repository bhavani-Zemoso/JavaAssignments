package core_java.three;

import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int numberOfGuesses = 0, guessedNumber = 0;

        while(true)
        {
            System.out.println("Try guessing the computer's random number : ");
            guessedNumber = keyboard.nextInt();
            numberOfGuesses++;

            if(guessedNumber == randomNumber)
            {
                System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " guesses. Thanks for playing!");
                break;
            }

            else if(guessedNumber < 1 || guessedNumber > 100)
                System.out.println("It was a wasted guess!");

            else if(guessedNumber > randomNumber)
                System.out.println("Guessed number was too high!");

            else
                System.out.println("Guessed number was too low!");


        }
    }
}
