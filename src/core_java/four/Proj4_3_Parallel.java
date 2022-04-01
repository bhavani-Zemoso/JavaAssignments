package core_java.four;

import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

       String names[] = new String[5];
       int ages[] = new int[5];

       for(int i = 0; i < names.length; i++)
       {
           System.out.print("Enter a name : ");
           names[i] = keyboard.nextLine();

           System.out.print("Enter an age : ");
           ages[i] = keyboard.nextInt();
           keyboard.nextLine();

           System.out.println();
       }

       for(int i = 0; i < names.length; i++)
           System.out.println(names[i] + " is " + ages[i] + " years old.");
    }
}
