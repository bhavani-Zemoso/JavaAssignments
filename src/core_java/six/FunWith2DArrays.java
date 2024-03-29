package core_java.six;

import java.util.Random;

public class FunWith2DArrays {
    public static void main(String[] args) {
        //2 row and 3 columns
        int[][] my2DArray = new int[2][3];

        fill(my2DArray);
        print2DArray(my2DArray);

        System.out.println();

        twice2DArray(my2DArray);
        print2DArray(my2DArray);
    }

    public static void fill(int[][] twoDArr)
    {
        Random random = new Random();
        for(int i = 0; i < twoDArr.length; i++)
        {
            for(int j = 0; j < twoDArr[i].length; j++)
                twoDArr[i][j] = random.nextInt(100) + 1;
        }
    }

    public static void print2DArray(int[][] twoDArr)
    {
        for(int[] arr : twoDArr)
        {
            for(int num : arr)
                System.out.print(num + " ");

            System.out.println();
        }
    }

    public static void twice2DArray(int[][] twoDArr)
    {
        for(int i = 0; i < twoDArr.length; i++)
        {
            for(int j = 0; j < twoDArr[i].length; j++)
                twoDArr[i][j] *= 2;
        }
    }
}
