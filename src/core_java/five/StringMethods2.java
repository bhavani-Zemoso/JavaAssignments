package core_java.five;

import java.util.Locale;

public class StringMethods2 {
    public static void main(String[] args) {
        String myName = "Bhavani Somanchi";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereIsS = myName.indexOf('S');

        String lastName = myName.substring(8);

        System.out.println("Upper is : " + upper);
        System.out.println("Lower is : " + lower);
        System.out.println("S is at index : " + whereIsS);
        System.out.println("Last name : " + lastName);

    }
}
