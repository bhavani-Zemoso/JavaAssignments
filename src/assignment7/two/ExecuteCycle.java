package assignment7.two;

public class ExecuteCycle {
    public static void main(String args[])
    {
        //Upcasting
        //Only overridden methods in subclass and parent class methods
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
        //For accessing subclass specific methods
        //Unicycle unicycle = new Cycle();


        Unicycle unicycle = (Unicycle)cycles[0];
        unicycle.display();
        unicycle.balance();

        Bicycle bicycle = (Bicycle) cycles[1];
        bicycle.display();
        bicycle.balance();

        Tricycle tricycle = (Tricycle) cycles[2];
        tricycle.display();
    }
}
