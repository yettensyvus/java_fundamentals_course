package com.company;

import java.util.Scanner;

public class Task {

    public static Scanner in = new Scanner(System.in);

    public static void spiral()
    {
        System.out.print("Input the row:");
        int row = in.nextInt();
        System.out.print("Input the column:");
        int column = in.nextInt();

        String[][] array = new String[row][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                double random = Math.random() * 10;
                int rand_int = (int) random;
                array[i][j] = Integer.toString(rand_int);
                System.out.println("Array[" + i + "][" + j + "]:" + array[i][j]);
            }
        }

        System.out.println("Output current array:\n");
        for (String[] strings : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }

        System.out.println("Spiral matrix:\n");
        int j = 0;

        for (int i = row - 1; i > 0; i--, j++) {
            for (int num = j; num < i; num++)
                System.out.println("Value Matrix[" + j + "][" + num + "]:" + array[j][num]);

            for (int num = j; num < i; num++)
                System.out.println("Value Matrix[" + num + "][" + i + "]:" + array[num][i]);

            for (int num = i; num > j; num--)
                System.out.println("Value Matrix[" + i + "][" + num + "]:" + array[i][num]);

            for (int num = i; num > j; num--)
                System.out.println("Value Matrix[" + num + "][" + j + "]:" + array[num][j]);
        }
        int m = (row - 1) / 2;
        if (row % 2 == 1)
            System.out.println("Value Matrix[" + m + "][" + m + "]:" + array[m][m]);

    }


    public static void row_column()
    {
        System.out.print("Input row:");
        int r = in.nextInt();   //analogy for arr[i]
        System.out.print("Input column");
        int c = in.nextInt(); //analogy for arr[c]

        String[][] array = new String[r][c]; //Initialize Array with 2d-matrix with size row x column
        //Make cycle for row,begin with zero index, then each element compare do arr.length and pass through iteration until we done
        for(int i=0;i<array.length;i++)
        {
            //Then to column, the process the same.
            for(int j=0;j<array.length;j++)
            {
                //In body cycle set the instruction, where declare random elements of array with bound 1-10
                double random = Math.random() * 10;
                int integer_rand =(int) random;
                array[i][j] = Integer.toString(integer_rand); //
                System.out.print("\nArray["+i+"]["+j+"]:"+array[i][j]);
            }
        }
        System.out.println("\nOutput current array...");
        for (String[] strings : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }


        System.out.println("\nOutput the new array...");

        for(int j=0;j<array.length;j++)
        {
            for (String[] strings : array) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }

    }


    public static void snake()
    {
        System.out.print("Input amount for row:");
        int row = in.nextInt();
        System.out.print("Input amount for column:");
        int column = in.nextInt();
        String[][] array  = new String[row][column];

        for(int i=0;i< array.length;i++)
        {
            for(int j=0;j< array.length;j++)
            {
                double random = Math.random() * 10;
                int rand_integer = (int)random;
                array[i][j] = Integer.toString(rand_integer);
                System.out.print("\nArray["+i+"]["+j+"]:"+array[i][j]);
            }
        }

        System.out.println("\nOutput current array...\n");
        for (String[] strings : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();

        }

        System.out.println("\n Output snake Matrix:\n");
        for(int i=0;i< array.length;i++)
        {
            if(i%2==0)
                for(int j=0;j< array.length;j++)
                {
                    System.out.print(array[i][j] + " ");
                }

            else
                for(int j=0;j< array.length;j++)
                {
                    System.out.print(array[i][j] + " ");
                }
            System.out.println(" ");
        }

    }

    public static void diagonal()
    {
        System.out.print("Input row:");
        int row = in.nextInt();
        System.out.print("Input column:");
        int column = in.nextInt();
        String[][] array = new String[row][column];


        for(int i=0;i< array.length;i++)
        {
            for(int j=0;j< array.length;j++)
            {
                double random = Math.random() * 10;
                int rand_int = (int) random;
                array[i][j] = Integer.toString(rand_int);
                System.out.println("Index["+i+"]["+j+"]:"+array[i][j]);
            }
        }
        System.out.println("\nCurrent matrix:\n");
        for (String[] strings : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix with Diagonal:\n");

        for(int k=0;k< array.length;k++)
        {
            for(int i=0;i< array.length;i++)
                for (int j=0;j< array.length;j++)
                    if(i+j== k)
                        System.out.println("Index["+i+"]["+j+"]:"+array[i][j]);
        }
        for(int k=1;k< array.length;k++)
        {
            int sum = array.length-1+k;
            for(int i=0;i< array.length;i++)
                for(int j=0;j<array.length;j++)
                    if(i+j==sum)
                        System.out.println("Index["+i+"]["+j+"]:"+array[i][j]);
        }
    }


}
