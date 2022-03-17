package assignment7;

public class Squirrel extends Rodent{
    public Squirrel()
    {
        System.out.println("Hi! I'm Squirrel");
    }
    @Override
    public void diet() {
        System.out.println("I am an omnivore. My favourite mostly include fruits and nuts but I don't mind munching some insects.");
    }

    @Override
    public void placeOfLiving() {
        System.out.println("I dig burrows in the ground to live in. Some of my friends fly and they make their homes in tree holes.");
    }

    @Override
    public void printCharacteristics() {
        System.out.println("I have a slender body with very long and bushy tail.");
    }
}
