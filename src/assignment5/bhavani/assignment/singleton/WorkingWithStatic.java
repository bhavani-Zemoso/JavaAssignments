package assignment5.bhavani.assignment.singleton;

public class WorkingWithStatic {
    String str;

    public static void initializeStr(String newString)
    {
        /*
        Non static variables cannot be used in a static context.
        Non static variables belong to an object instead of a class.
        Therefore the value of the variable differs as the instance
        differs which results in ambiguity.
        Non static members can be used in static contexts by creating
        an instance and using the instance to refer to the non static members.
         */

        //str = newString;

        /*
        WorkingWithStatic instance = new WorkingWithStatic();
        instance.str = newString;
         */

    }

    public void printString()
    {
        System.out.println(str);
    }


}
