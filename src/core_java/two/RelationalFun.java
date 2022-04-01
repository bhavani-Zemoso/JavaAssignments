package core_java.two;

public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 20;
        int yourAge = 16;
        int bobsAge = 16;

        String myName = "Bhavani";
        String yourName = "Bhav";

        int currentAge = 20;

        System.out.println("myBool is : " + myBool);
        System.out.println("yourBool is : " + yourBool);

        //Relational operations
        boolean ageComparision = myAge > yourAge;
        System.out.println("myAge > yourAge?: " + ageComparision);

        ageComparision = yourAge > bobsAge;
        System.out.println("yourAge > bobsAge?: " + ageComparision);

        ageComparision = yourAge == bobsAge;
        System.out.println("yourAge == bobsAge?: " + ageComparision);

        boolean nameComparision = myName.equals(yourName);
        System.out.println("do names match?: " + nameComparision);

        boolean isGreater21 = currentAge >= 21;
        System.out.println("Is my age equal to or above 21?: " + isGreater21);
    }
}
