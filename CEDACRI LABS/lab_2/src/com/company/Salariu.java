package com.company;

public class Salariu {

    public static void main(String[] args) {

        System.out.println(" ");

        Lucrator s1 = new Lucrator();
        s1.nume_lucrator = "Straton Alexandru";
        s1.profesie = "Database Administrator";
        s1.salariu = 17500;
        s1.afiseaza();

        System.out.println(" ");

        Lucrator s2 = new Lucrator();
        s2.nume_lucrator = "Cepraga Maxim";
        s2.profesie = "Java Developer";
        s2.salariu = 19500;
        s2.afiseaza();

        System.out.println(" ");

        Lucrator s3 = new Lucrator();
        s3.nume_lucrator = "Schirca Vadim";
        s3.profesie = "System Administrator";
        s3.salariu = 18250;
        s3.afiseaza();
    }
}
