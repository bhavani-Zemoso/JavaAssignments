package assignment10;

import java.util.Iterator;

public class SList<Type>{

    private Node<Type> head = new Node<Type>(null);

    public String toString()
    {
        if(head == null)
            return "[]";

        StringBuilder builder = new StringBuilder();
        builder.append('[');

        SListIterator<Type> iterator = this.iterator();

        while(iterator.hasNext())
        {
            Type data = iterator.next();
            builder.append(String.valueOf(data));
            if(iterator.hasNext())
                builder.append(", ");
        }

        builder.append("]");
        return builder.toString();
    }

    public SListIterator<Type> iterator()
    {
        return new SListIterator<Type>(head);
    }


}
