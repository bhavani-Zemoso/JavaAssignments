package core_java.three;

import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {

        int dieNumber;
        Random random = new Random();
        for(int i = 1; i <= 10; i++)
        {
            dieNumber = random.nextInt(6) + 1;
            System.out.println("Die number : " + dieNumber);
        }

    }
}
