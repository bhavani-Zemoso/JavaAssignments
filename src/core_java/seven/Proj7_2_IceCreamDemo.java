package core_java.seven;

public class Proj7_2_IceCreamDemo {
    public static void main(String[] args) {
        Proj7_2_IceCream iceCream1 = new Proj7_2_IceCream("Chocolate", 30, 3);

        printIceCreams(iceCream1);

        iceCream1.addTopping("Choco chips");
        iceCream1.addTopping("Strawberries");

        printIceCreams(iceCream1);
    }

    public static void printIceCreams(Proj7_2_IceCream iceCream)
    {
        System.out.println("This is a " + iceCream.getName() + " ice cream. " +
                "It has " + iceCream.getNumScoops() + " scoops. " +
                "It costs $" + iceCream.getCost() + ".");
        iceCream.printToppings();
    }
}
