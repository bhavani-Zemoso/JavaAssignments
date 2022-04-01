package assignment7.four;

public class CycleFactory {
    String type;
    public CycleFactory(String type)
    {
        this.type = type;
    }

    public Cycle chooseCycle()
    {
        if(type.equalsIgnoreCase("Unicycle"))
            return new Unicycle();

        else if(type.equalsIgnoreCase("Bicycle"))
            return new Bicycle();

        else if(type.equalsIgnoreCase("Tricycle"))
            return new Tricycle();

        else
            return null;
    }
}
