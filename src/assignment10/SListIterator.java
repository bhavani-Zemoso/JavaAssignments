package assignment10;

import java.util.Iterator;

public class SListIterator<Type> {

    Node<Type> current;

    public SListIterator(Node<Type> head)
    {
        current = head;
    }

    public boolean hasNext() {
        return(current.next != null);
    }

    public Type next() {
        current = current.next;
        return current.data;
    }

    public void add(Type data)
    {
        Node<Type> newNode = new Node<Type>(data);

            while(hasNext())
                current = current.next;

            current.next = newNode;


        System.out.println("New node added");

    }

    public void addAtPosition(Type data, int pos)
    {
        Node<Type> newNode = new Node<Type>(data);

            int i = 1;
            Node<Type> prev = null;

            while(hasNext() && i <= pos)
            {
                prev = current;
                current = current.next;
                i++;
            }

            if(!hasNext())
                add(data);

            else
            {
                prev.next = newNode;
                newNode.next = current;

                System.out.println("New node added");
            }

    }

    public void remove()
    {
        Node<Type> prev = null;

        while(hasNext())
        {
            prev = current;
            current = current.next;
        }

        prev.next = null;

        System.out.println("Node removed");
    }

    public void remove(int pos)
    {
        Node<Type> prev= null;

        int i = 1;
        while(i <= pos)
        {
            prev = current;
            if(hasNext())
            current = current.next;
            i++;
        }

        prev.next = current.next;
        System.out.println("Node removed");
    }
}
