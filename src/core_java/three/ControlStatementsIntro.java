package core_java.three;

public class ControlStatementsIntro {
    public static void main(String[] args) {
        int age = 19;
        //System.out.println(age);

        if(age >= 16)
            System.out.println("You can drive!");
        else
            System.out.println("You cannot drive yet!");

        System.out.println(); //add some newline space

        for(int i = 1; i <= age; i++)
            System.out.println("Happy Birthday " + i);


    }
}
