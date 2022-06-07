package assignment10;

public class LinkedList {
    public static void main(String args[])
    {
        SList<Integer> list = new SList<>();
        SListIterator<Integer> iterator;

        System.out.println("Adding 12 to the list : ");
        iterator = list.iterator();
        iterator.add(12);
        System.out.println(list.toString());

        System.out.println("Adding 24 to the list : ");
        iterator = list.iterator();
        iterator.add(24);
        System.out.println(list.toString());

        System.out.println("Adding 34 to the list : ");
        iterator = list.iterator();
        iterator.addAtPosition(34,1);
        System.out.println(list.toString());

        System.out.println("Adding 45 to the list : ");
        iterator = list.iterator();
        iterator.addAtPosition(45,3);
        System.out.println(list.toString());

        System.out.println("Removing from the end of the list : ");
        iterator = list.iterator();
        iterator.remove();
        System.out.println(list.toString());

        System.out.println("Removing from a specific position of the list : ");
        iterator = list.iterator();
        iterator.remove(2);
        System.out.println(list.toString());

    }
}
