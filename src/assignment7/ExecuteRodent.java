package assignment7;

public class ExecuteRodent {
    public static void main(String args[])
    {
        Rodent rodents[] = new Rodent[3];

        rodents[0] = new Mouse();
        rodents[0].burrow();
        rodents[0].diet();
        rodents[0].placeOfLiving();
        rodents[0].printCharacteristics();

        rodents[1] = new Squirrel();
        rodents[1].burrow();
        rodents[1].diet();
        rodents[1].placeOfLiving();
        rodents[1].printCharacteristics();

        rodents[2] = new Lemming();
        rodents[2].burrow();
        rodents[2].diet();
        rodents[2].placeOfLiving();
        rodents[2].printCharacteristics();
    }
}
