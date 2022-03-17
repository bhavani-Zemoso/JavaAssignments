package assignment7.two;

public class ExecuteCycle {
    public static void main(String args[])
    {
        //Upcasting
        Cycle cycles[] = new Cycle[3];

        cycles[0] = new Unicycle();
        cycles[0].display();
        //cycles[0].balance();

        cycles[1] = new Bicycle();
        cycles[1].display();
        //cycles[1].balance();

        cycles[2] = new Tricycle();
        cycles[2].display();

        //Downcasting
        //Unicycle unicycle = new Cycle();

        Cycle cycle = new Cycle();

        Unicycle unicycle = (Unicycle)cycle;
        unicycle.display();
        unicycle.balance();

        Bicycle bicycle = (Bicycle) cycle;
        bicycle.display();
        bicycle.balance();

        Tricycle tricycle = (Tricycle) cycle;
        tricycle.display();
    }
}
