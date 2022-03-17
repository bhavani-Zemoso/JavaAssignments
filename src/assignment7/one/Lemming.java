package assignment7.one;

public class Lemming extends Rodent {
    public Lemming()
    {
        System.out.println("Hi! I'm Lemming");
    }

    @Override
    public void diet() {
        System.out.println("I am a herbivore. I mostly gnaw on plants. I have a large plant appetite and mostly feed on grasses, shrubs and twigs");
    }

    @Override
    public void placeOfLiving() {
        System.out.println("I mostly live in extremely cold climate like Greenland, Norway and Russia. I dig burrows in the snow so that I can be warm");
    }

    @Override
    public void printCharacteristics() {
        System.out.println("I am very tiny in appearance but I am covered with thick fur.I have a short tail and flattened claws.");
    }
}
