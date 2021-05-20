package com.company;

import java.util.Scanner;

public class Task {

    //initializam metoda scanner
    public static Scanner in = new Scanner(System.in);

    //1.1 Write a program to display any message:
    static void task_1() {
        System.out.println("Hello World!");
    }

    //1.2 Write a Java program to display default value of all primitive data types of Java.
    static void task_2() {

        class variables{
            boolean boolean_;
            byte byte_;
            char char_;
            short short_;
            int int_;
            long long_;
            float float_;
            double double_;
        }

        variables var = new variables( );

            System.out.println("Boolean: " + var.boolean_);
            System.out.println("Byte: " + var.byte_);
            System.out.println("Char: " + var.char_);
            System.out.println("Short: " + var.short_);
            System.out.println("Int: " + var.int_);
            System.out.println("Long: " + var.long_);
            System.out.println("Float: " + var.float_);
            System.out.println("Double: " + var.double_);
    }

    //1.3 Write a program check two strings are equal or not

    static void task_3() {

        String str_1, str_2;

        System.out.print("String 1: ");
        str_1 = in.next();

        System.out.print("String 2: " );
        str_2 = in.next();

        if(str_1.equals(str_2))
            System.out.print("Stringuriele sunt identice");
        else
            System.out.print("Stringuriele nu sunt identice");

    }


}
