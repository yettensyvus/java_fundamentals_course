package com.company;

import java.util.Scanner;

public class Task {

    //initializam metoda scanner
    public static Scanner in = new Scanner(System.in);

    //2.1.1 Increment and decrement operators.
    static void task_1() {
        int a, b;

        System.out.print("a : ");
        a = in.nextInt();
        System.out.print("b : ");
        b = in.nextInt();

        System.out.println("a incremented is : " + ++a);
        System.out.println("b decremented is : " + --b);

    }

    //2.1.2 Bitwise Complement Operator.
    static void task_2() {

        int a, b;
        System.out.print("a : ");
        a = in.nextInt();
        b=~a;
        System.out.print("a bitwise complement is: " + b);
    }

    //2.1.3 Arithmetic operator.
    static void task_3() {

        float a, b;

        System.out.print("a : ");
        a = in.nextFloat();

        System.out.print("b : ");
        b = in.nextFloat();

        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));
    }

    //2.1.4 Relational Operator
    static void task_4() {

        int a, b, c;

        System.out.print("a : ");
        a = in.nextInt();

        System.out.print("b : ");
        b = in.nextInt();

        System.out.print("c : ");
        c = in.nextInt();

        System.out.println ("a < b = " + (a<b));
        System.out.println ("a > c = " + (a>c));
        System.out.println ("a <= c = " + (b<=c));
        System.out.println ("a >= b = " + (a>=b));
        System.out.println ("b == c = " + (b==c));
        System.out.println ("a != c = " + (a!=c));

    }


    //2.1.5 Bitwise operator.
    static void task_5() {

        int a, b;

        System.out.print("a : ");
        a = in.nextInt();

        System.out.print("b : ");
        b = in.nextInt();

        System.out.println ("a & b = " + (a&b)) ;
        System.out.println ("a | b = " + (a|b));
        System.out.println ("a ^ b = " + (a^b));

    }

    //2.1.6 Conditional Operator.
    static void task_6() {

        String string_1, string_2;

        System.out.print("string_1 : ");
        string_1 = in.next();

        System.out.print("string_2 : ");
        string_2 = in.next();

        if((string_1.equals("Hello")) && (string_2.equals("Hello")))
            System.out.println("string_1 = Hello AND string_2 = Hello");

        else if((string_1.equals("Hello")) || (string_2.equals("Hello")))
            System.out.println("string_1 = Hello OR string_2 = Hello");

    }

    //2.2.1 If statements.
    static void task_7() {

        int a, b;

        System.out.print("a : ");
        a = in.nextInt();

        System.out.print("b : ");
        b = in.nextInt();

        if(a>b)
            System.out.println("A este mai mare ca B");
        else
            System.out.println("A este mai mic ca B");

    }

    //2.2.2 Switch Statements.
    static void task_8() {

        System.out.println("1)  Display Hello World! ");
        System.out.println("2)  2+2 = ?");


        switch (in.nextInt()) {

            case 1:
                System.out.println("Hello World!");
                break;
            case 2:
                System.out.println("4");
                break;
        }
    }


    //2.2.3 For loop.
    static void task_9() {

        int x;

        System.out.print("x : ");
        x = in.nextInt();

        for(int i = 0 ; i < x; i++)
        {
            System.out.println(i + ") Hello World!");
        }

    }

    //2.2.4 While Statements.
    static void task_10()
    {

        int x = 1000;

        while (x>0)
        {
            System.out.println(x-7);
            x = x - 7;

        }

    }

    //2.2.5 Do statements
    static void task_11()
    {

        int x = -1;

        do
        {
            System.out.println(x+7);
            x = x + 7;

        }
        while(x<1000);

    }
}
