package core_java.five;

public class StringMethods1 {
    public static void main(String[] args) {
        String name = "John Baugh";
        String name2 = "John Baugh";
        String name3 = "Rob Percivel";
        String myName = "Bhavani Somanchi";

        for(int i = 0; i < name.length(); i++)
        {
            System.out.print(name.charAt(i) + " ");
        }

        System.out.println();

        if(name.equals(name2))
            System.out.println("Names are equal.");
        else
            System.out.println("Names aren't equal.");

        if(name.compareTo(name2) > 0)
            System.out.println("John Baugh is greater than Rob Percivel");
        else if(name.compareTo(name2) < 0)
            System.out.println("John Baugh is lesser than Rob Percivel");
        else
            System.out.println("Both names are same.");

        //Challenge

        if(myName.compareTo(name2) > 0)
            System.out.println(myName + " is greater than " + name2);
        else if(myName.compareTo(name2) < 0)
            System.out.println(myName + " is lesser than " + name2);
        else
            System.out.println(myName + " is equal to " + name2);

    }
}
