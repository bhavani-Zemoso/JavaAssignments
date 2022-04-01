package core_java.six;

import java.util.Scanner;

public class Proj6_2_TicTacToe {

    static char[][] gameBoard = new char[3][3];
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        runGame();
    }

    public static void runGame()
    {
        char winner = ' ';
        boolean xTurn = true;

        initializeBoard();
        printBoard();

        while(winner == ' ')
        {
            if(xTurn)
                System.out.println("It is X's turn");

            else
                System.out.println("It is O's turn");

            getUserInput(xTurn);
            System.out.println();

            printBoard();

            winner = getWinner();
            if(winner == ' ' && isBoardFull())
                winner = 'C';

            xTurn = !xTurn;

        }

        System.out.println();

        if(winner == 'C')
            System.out.println("It was a CAT's game! No winner");
        else
            System.out.println("The winner is : " + winner);

    }

    public static void initializeBoard()
    {
        for(int i = 0; i < gameBoard.length; i++)
        {
            for(int j = 0; j < gameBoard[i].length; j++)
            {
                gameBoard[i][j] = ' ';
            }
        }
    }

    public static void printBoard()
    {
        for(int i = 0; i < gameBoard.length; i++)
        {
            for(int j = 0; j < gameBoard[i].length; j++)
            {
                System.out.print(gameBoard[i][j]);
                if(j < 2)
                    System.out.print('|');
            }
            System.out.println();
            if(i < 2)
                System.out.println("-----");

            System.out.println();
        }
    }

    public static void getUserInput(boolean xTurn)
    {
        int row = -1, column = -1;

        boolean keepAsking = true;
        while(keepAsking)
        {
            System.out.println("Please enter the row THEN the column, each from 0, 1, 2 separated by a space");
            row = keyboard.nextInt();
            column = keyboard.nextInt();
            keyboard.nextLine();

            if(row >= 0 && row <= 2 && column >= 0 && column <= 2)
            {
                if(!cellAlreadyOccupied(row, column))
                    keepAsking = false;

                else
                    System.out.println("That cell is already occupied");
            }
        }

        if(xTurn)
            gameBoard[row][column] = 'X';
        else
            gameBoard[row][column] = 'O';

    }

    public static boolean cellAlreadyOccupied(int row, int column)
    {
        return !(gameBoard[row][column] == ' ');
    }

    public static char getWinner()
    {
        final int ROWS = gameBoard.length;
        final int COLUMNS = gameBoard.length;

        for(int i = 0; i < ROWS; i++)
        {
            if(!(gameBoard[i][0] == ' ') &&
                    gameBoard[i][0] == gameBoard[i][1] &&
                    gameBoard[i][i] == gameBoard[i][2])
                return gameBoard[0][i];
        }

        for(int i = 0; i < COLUMNS; i++)
        {
            if(!(gameBoard[0][i] == ' ') &&
                    gameBoard[0][i] == gameBoard[1][i] &&
                    gameBoard[1][i] == gameBoard[2][i])
                return gameBoard[0][i];
        }

        if(!(gameBoard[0][0] == ' ') &&
                gameBoard[0][0] == gameBoard[1][1] &&
                gameBoard[1][1] == gameBoard[2][2])
            return gameBoard[0][0];

        if(!(gameBoard[2][0] == ' ') &&
                gameBoard[2][0] == gameBoard[1][1] &&
                gameBoard[1][1] == gameBoard[0][2])
            return gameBoard[2][0];

        return ' ';

    }

    public static boolean isBoardFull()
    {
        int countFill = 0;
        for(int i = 0; i < gameBoard.length; i++)
        {
            for(int j = 0; j < gameBoard[i].length; j++)
            {
                if(gameBoard[i][j] == ' ')
                    countFill++;
            }
        }

        return countFill == 9;

    }

}
