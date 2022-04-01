package core_java.two;

public class ArithmeticFun {
    public static void main(String args[])
    {
        int a = 10;
        int b = 15;

        //Binary operators
        int result = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;

        System.out.println("Result is : " + result);
        System.out.println("Difference is : " + difference);
        System.out.println("Product is : " + product);
        System.out.println("Quotient is : " + quotient);
        System.out.println("Remainder is : " + remainder);

        result += 20; //result = result + 20
        System.out.println("Result is now : " + result);

        //Unary operators
        result++; //++result
        System.out.println("Result++ : " + result);

        result--; //--result
        System.out.println("Result-- : " + result);

        product *= 2;
        System.out.println("Product is now : " + product);
    }
}
