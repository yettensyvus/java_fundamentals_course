package com.company;

import java.util.Scanner;

public class Task {

    //initializam metoda scanner
    public static Scanner in = new Scanner(System.in);

    static void task_1() {

        System.out.println("Primul program java...dar nu si ultimul!");
        System.out.println(" ");
        System.out.print("Primul program java...dar nu si ultimul!");
    }

    static void task_2() {

        System.out.println(" Nume: Straton Alexandru\n Virsta: 19 ani\n Adress: Chisinau, Moldova");
    }

    static void task_3() {

        //initializam variabilele
        int nr;
        int result;

        //introducem nr. de fete
        System.out.print("Introdu nr. de fete: ");
        nr = in.nextInt();

        //calculam nr. total de elevi
        result = (nr * 2) + 10;

        //afisam nr. de elevi
        System.out.print("Nr elevi: " + result);

    }

    static void task_4() {

        //initializam variabilele
        int white, red, blue;
        int total;

        //introducem nr. globuletelor albe
        System.out.print("Introdu nr. de globulete albe: ");
        white = in.nextInt();

        //calculam cate globulete rosii sunt
        red = white + 3;
        //calculam cate globulete albastre sunt
        blue = (white + red) - 2;
        //calculam nr. total de globulete
        total = white + red + blue;

        //afisam nr. de globulete
        System.out.print("Nr total de globulete: " + total);

    }

    static void task_5() {

        //initializam variabilele
        int n;

        //introducem numarul.
        System.out.print("Introdu un numar: ");
        n = in.nextInt();

        //afisam numarul.
        System.out.print((n-2) + " " + (n-1) + " " + n + " " +(n+1) + " " + (n+2));
    }

    static void task_6() {

        //initializam variabilele
        int v;
        int greutate, inaltime;

        //introducem varsta.
        System.out.print(" Introdu virsta: ");
        v = in.nextInt();

        //calculam inaltimea si greutatea ideala

        greutate = 2 * v + 8; //greutatea ideala in kg

        inaltime = 5 * v + 80; //inaltimea ideala in cm

        //afisam datele.
        System.out.print(" Varsta: " + v + "\n Greutatea ideala: " + greutate + " kg" + "\n Inaltimea ideala: " + inaltime + " cm");

    }

    static void task_7() {

        //initializam variabilele
        float cant_fasole, cant_rosii, cant_cartofi;
        float pret_fasole, pret_rosii, pret_cartofi;

        float total;

        //introducem datele
        System.out.print(" Cantitatate fasole (kg): ");
        cant_fasole = in.nextFloat();

        System.out.print(" Pret/kg fasole (lei): ");
        pret_fasole = in.nextFloat();

        System.out.print(" Cantitatate rosii (kg): ");
        cant_rosii = in.nextFloat();

        System.out.print(" Pret/kg rosii (lei): ");
        pret_rosii = in.nextFloat();

        System.out.print(" Cantitatate cartofi (kg): ");
        cant_cartofi = in.nextFloat();

        System.out.print(" Pret/kg cartofi (lei): ");
        pret_cartofi = in.nextFloat();

        //calculam totalul

        total = (cant_fasole * pret_fasole) + (cant_cartofi * pret_cartofi) + (cant_rosii * pret_rosii);

        //afisam totatul.
        System.out.print(" Pretul total al tuturor produselor: " + total + " lei");
    }

    static void task_8() {

        //initializam variabilele
        float a , b , result;


        //introducem datele
        System.out.print("a: ");
        a = in.nextFloat();

        System.out.print("b: ");
        b = in.nextFloat();

        //calculam expresia
        result = (float) (Math.pow(a , 2) + Math.pow(b , 2));

        //afisam rezultatul
        System.out.print(a + "^2 + " + b + "^2 = " + result);
    }

    static void task_9() {

        //initializam variabilele
        float  x, y, z, g;
        float media;

        //introducem datele
        System.out.print(" Nota 1: ");
        x = in.nextFloat();

        System.out.print(" Nota 2: ");
        y = in.nextFloat();

        System.out.print(" Nota 3: ");
        z = in.nextFloat();

        System.out.print(" Nota Examen: ");
        g = in.nextFloat();

        //calculam media
        media =  Math.round((((x + y + z)/3) + g)/2);

        //afisam rezultatul
        System.out.print(" Media este: " + media);

    }

    static void task_10() {

        //initializam variabilele
        float  v1, v2;
        float media;

        //introducem datele
        System.out.print(" v1 [km/h]: ");
        v1 = in.nextFloat();

        System.out.print(" v2 [km/h]: ");
        v2 = in.nextFloat();

        //calculam media
        media =  (v1 + v2) / 2;

        //afisam rezultatul
        System.out.print(" Media este: " + media);

    }
}


