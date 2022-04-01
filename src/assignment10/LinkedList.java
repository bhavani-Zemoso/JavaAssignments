package assignment10;

public class LinkedList {
    public static void main(String args[])
    {
        SList<Integer> list = new SList<>();
        SListIterator<Integer> iterator = list.iterator();

        iterator.add(12);
        System.out.println(list.toString());

        iterator.add(24);
        System.out.println(list.toString());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        iterator.remove();
        System.out.println(list.toString());


    }
}
