package core_java.three;

public class EvenOnly {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++)
        {
            if(i % 2 != 0)
                continue;
            System.out.print(i + "\t");
        }
    }
}
