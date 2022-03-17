package assignment5.bhavani.assignment.data;

public class InitializationOfMembers {
    int integerMember;
    char characterMember;

    public void printInstanceVariables()
    {
        System.out.println("Instance integer variable = " + integerMember);
        System.out.println("Instance character variable = " + characterMember);
    }

    public void printLocalVariables()
    {
        int integerLocalMember;
        char characterLocalMember;

        /* Java Compiler does not allow the printing of the
           above local variables as they are not initialized

           The instance variables will be initialized
           automatically by a default constructor but the same
           is not true for local variables.

           Local variables are not initialized automatically as
           it can also be error-prone and highly expensive.

           Therefore local variables have to be initialized before
            being used.
         */

        integerLocalMember = 45;
        characterLocalMember = 'i';

        System.out.println("Local integer variable = " + integerLocalMember);
        System.out.println("Local character variable = " + characterLocalMember);
    }
}
