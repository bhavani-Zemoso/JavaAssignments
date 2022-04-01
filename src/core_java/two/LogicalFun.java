package core_java.two;

public class LogicalFun {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isWarm = true;

        System.out.println("for isRaining = true ; isWarm = true");
        checkResults(isRaining, isWarm);

        isRaining = true;
        isWarm = false;

        System.out.println("for isRaining = true ; isWarm = false");
        checkResults(isRaining, isWarm);

        isRaining = false;
        isWarm = true;

        System.out.println("for isRaining = false ; isWarm = true");
        checkResults(isRaining, isWarm);

        isRaining = false;
        isWarm = false;

        System.out.println("for isRaining = false ; isWarm = false");
        checkResults(isRaining, isWarm);

    }

    public static void checkResults(boolean isRaining, boolean isWarm)
    {
        boolean combined = isRaining && isWarm;
        System.out.println("is it raining and warm?: " + combined);

        combined = isRaining || isWarm;
        System.out.println("is it raining or warm?: "+ combined);

        combined = !isRaining;
        System.out.println("is it NOT raining outside?: " + combined + '\n');
    }
}
