package com.company;
import java.util.*;

public class Main extends Task{

    public static void cls() {
        for (int i = 0; i < 80 * 300; i++)
            System.out.println("\b");
    }

    public static Scanner in = new Scanner(System.in);
    public static Scanner exit = new Scanner(System.in);

    public static void main(String[] args) {

        int input;

        do {
            cls();
            System.out.println("Alegeti un punct din menu:");
            System.out.println(" ");
            System.out.println("1)   Spiral  ");
            System.out.println("2)   Rows / Columns  ");
            System.out.println("3)   Snake  ");
            System.out.println("4)   Diagonals");
            System.out.println(" ");
            System.out.print("\r\nSelectati o optiune: ");

            do {
                input = in.nextInt();

                if (input < 0 || input > 4)
                {
                    System.out.println(input + ") Nu este inclus in lista de functii! ");
                    System.out.println(" ");
                    System.out.print("Reintroduceti: ");
                }

            }while(input < 0 || input > 4);

            switch (input) {
                case 1:
                {
                    cls();
                    spiral();
                    System.out.println(" ");
                    System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                    exit.nextLine();
                }
                break;

                case 2:
                {
                    cls();
                    row_column();
                    System.out.println(" ");
                    System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                    exit.nextLine();
                }
                break;

                case 3:
                {
                    cls();
                    snake();
                    System.out.println(" ");
                    System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                    exit.nextLine();
                }
                break;

                case 4:
                {
                    cls();
                    diagonal();
                    System.out.println(" ");
                    System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                    exit.nextLine();
                }
                break;

               

            }
        } while (input != 0);

    }
}
