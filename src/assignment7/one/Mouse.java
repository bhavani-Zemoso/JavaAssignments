package assignment7.one;

public class Mouse extends Rodent {
    public Mouse()
    {
        System.out.println("Hi! I'm Mouse");
    }
    @Override
    public void diet() {
        System.out.println("I eat all kinds of fruits and vegetables. I am an opportunistic carnivore.");
    }

    @Override
    public void placeOfLiving() {
        System.out.println("I like to live around human structures. I live in storage boxes, attics, barns, sheds and cabinets. People freak out when they see us!");
    }

    @Override
    public void printCharacteristics() {
        System.out.println("I have a slender body, scantily haired, narrow hind feet and sharp small claws. My thinly furred tail appears hairless");
    }
}
