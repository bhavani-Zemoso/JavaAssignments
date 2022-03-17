package assignment6;

public class ArrayOfObjects {
    String str;
    public ArrayOfObjects(String str)
    {
        this.str = str;
        System.out.println("String is " + str);
    }

    public static void main(String args[])
    {
        ArrayOfObjects objects[] = new ArrayOfObjects[2];
        objects[0] = new ArrayOfObjects("Summer");
        objects[1] = new ArrayOfObjects("Winter");
    }
}
