package core_java.six;

public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(10);
        int result = giveMe10();
        System.out.println(result);
        result = addThese(12,78);
        System.out.println(result);
        double result2 = squareNumber(12.676);
        System.out.println(result2);
    }

    //void , parameterless method
    public static void printHello()
    {
        System.out.println("Hello there!");
    }

    //void, parameterized
    public static void printNumber(int a)
    {
        System.out.println("The number is : " + a);
    }

    //value-returning, parameterless
    public static int giveMe10()
    {
        return 10;
    }

    //value-returning,  parameterized
    public static int addThese(int num1, int num2)
    {
        return (num1 + num2);
    }

    public static double squareNumber(double number)
    {
        return(number * number);
    }
}
