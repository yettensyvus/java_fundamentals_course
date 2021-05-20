package com.company;

import java.util.Scanner;

public class Main extends Task{

    public static void cls() {
        for(int i = 0; i < 80*300; i++) // cmd default height = 300 and default width = 80
            System.out.println("\b"); //print backspace
    }

    public static void main(String[] args) {
        boolean showMenu = true;
        while (showMenu) {
            showMenu = menu();
        }
    }

    public static boolean menu() {

        //input data
        Scanner in = new Scanner(System.in);

        //exit
        Scanner exit = new Scanner(System.in);

        cls();
        System.out.println("Alegeti un punct din menu:");
        System.out.println(" ");
        System.out.println("1)   Increment and decrement operators. ");
        System.out.println("2)   Bitwise Complement Operator.");
        System.out.println("3)   Arithmetic operator. ");
        System.out.println("4)   Relational Operator. ");
        System.out.println("5)   Bitwise operator. ");
        System.out.println("6)   Conditional Operator. ");
        System.out.println("7)   If statements. ");
        System.out.println("8)   Switch Statements. ");
        System.out.println("9)   For loop. ");
        System.out.println("10)  While Statements. ");
        System.out.println("11)  Do statements. ");
        System.out.println(" ");
        System.out.print("\r\nSelectati o optiune: ");

        // task's
        switch (in.nextInt()) {

            case 1:
                cls();
                task_1();
                System.out.println(" ");
                System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                exit.nextLine();
                return true;

            case 2:
                cls();
                task_2();
                System.out.println(" ");
                System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                exit.nextLine();
                return true;

            case 3:
                cls();
                task_3();
                System.out.println(" ");
                System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                exit.nextLine();
                return true;
            case 4:
                cls();
                task_4();
                System.out.println(" ");
                System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                exit.nextLine();
                return true;
            case 5:
                cls();
                task_5();
                System.out.println(" ");
                System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                exit.nextLine();
                return true;
            case 6:
                cls();
                task_6();
                System.out.println(" ");
                System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                exit.nextLine();
                return true;
            case 7:
                cls();
                task_7();
                System.out.println(" ");
                System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                exit.nextLine();
                return true;
            case 8:
                cls();
                task_8();
                System.out.println(" ");
                System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                exit.nextLine();
                return true;
            case 9:
                cls();
                task_9();
                System.out.println(" ");
                System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                exit.nextLine();
                return true;
            case 10:
                cls();
                task_10();
                System.out.println(" ");
                System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                exit.nextLine();
                return true;
            case 11:
                cls();
                task_11();
                System.out.println(" ");
                System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                exit.nextLine();
                return true;
            default:
                return true;
        }
    }
}
