package assignment5.bhavani.assignment.main;

import assignment5.bhavani.assignment.data.InitializationOfMembers;
import assignment5.bhavani.assignment.singleton.WorkingWithStatic;

public class Main {

    public void callFirstClass()
    {
        InitializationOfMembers instance = new InitializationOfMembers();
        instance.printInstanceVariables();
        instance.printLocalVariables();
    }

    public static void callSecondClass()
    {
        WorkingWithStatic instance = new WorkingWithStatic();
        instance.printString();
    }

    public static void main(String args[])
    {
        Main mainObject = new Main();
        mainObject.callFirstClass();
        Main.callSecondClass();
    }
}
