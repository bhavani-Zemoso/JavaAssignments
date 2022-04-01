package core_java.seven;

import java.util.ArrayList;

public class Proj7_2_IceCream {
    private String name;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings = new ArrayList<>();

    public Proj7_2_IceCream(String name, int cost, int numScoops)
    {
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
    }

    public void addTopping(String topping)
    {
        toppings.add(topping);
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getNumScoops() {
        return numScoops;
    }

    public void printToppings()
    {
        if(toppings.size() == 0)
            System.out.println("The ice cream currently has no toppings");
        else
        {
            System.out.println("Ice cream is topped with : ");
            for(String topping : toppings)
                System.out.println("\t" + topping);
        }
        System.out.println();

    }
}
