package assignment7.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecuteCycleFactory {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the type of cycle needed");
        String type = reader.readLine();

        CycleFactory factory = new CycleFactory(type);
        Cycle cycle = factory.chooseCycle();
        cycle.numberOfWheels();
    }
}
