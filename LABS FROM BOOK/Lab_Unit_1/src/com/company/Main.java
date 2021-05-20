package com.company;

import java.util.Scanner;

public class Main extends Task{

    public static void cls() {
        for(int i = 0; i < 80*300; i++) // Default Height of cmd is 300 and Default width is 80
            System.out.println("\b"); // Prints a backspace
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
        System.out.println("1)  Display any message. ");
        System.out.println("2)  Display default value of all primitive data types of Java.");
        System.out.println("3)  Check two strings are equal or not. ");
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
            default:
                return true;
        }
    }
}
