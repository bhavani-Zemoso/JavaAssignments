package assignment10;

import java.util.Iterator;

public class SListIterator<Type> implements Iterator {

    Node<Type> current;

    public SListIterator(Node<Type> head)
    {
        current = head;
    }

    @Override
    public boolean hasNext() {
        return(current.next != null);
    }

    @Override
    public Type next() {
        current = current.next;
        return current.data;
    }

    public void add(Type data)
    {
        Node<Type> newNode = new Node<Type>(data, current.next);
        current.next = newNode;
        System.out.println("New node added");

    }

    @Override
    public void remove()
    {
        //System.out.println(current.data);
        if(current.next != null)
            current.next = current.next.next;

        System.out.println("Node removed");
    }
}
