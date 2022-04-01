package lambdas_and_streams;

public class FunctionalInterfaces {

    @FunctionalInterface
    interface Multiplier
    {
        int multiply(int i, int j);
    }

    Multiplier multiplierLambda = (i, j) -> i*j;

    public static void main(String[] args) {
        FunctionalInterfaces client = new FunctionalInterfaces();
    }
}
