package core_java.seven;

public class Proj7_3_CircleDemo {
    public static void main(String[] args) {
        Proj7_3_Circle myCircle = new Proj7_3_Circle();

        printDetails(myCircle);

        Proj7_3_Circle yourCircle = new Proj7_3_Circle(4.56);

        printDetails(yourCircle);
    }

    public static void printDetails(Proj7_3_Circle circle)
    {
        System.out.println("The circle has a radius of " + circle.getRadius() +
                " an area of " + String.format("%.2f", circle.area()) +
                " and a circumference of " + String.format("%.2f", circle.circumference()));

        System.out.println();
    }
}
