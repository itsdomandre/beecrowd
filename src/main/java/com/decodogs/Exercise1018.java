package org.example;

import java.util.Scanner;

public class Exercise1018 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int value = reader.nextInt();
        int rest = value;
        int notas100 = rest / 100;
        rest = rest % 100;
        int notas50 = rest / 50;
        rest = rest % 50;
        int notas20 = rest / 20;
        rest = rest % 20;
        int notas10 = rest / 10;
        rest = rest % 10;
        int notas5 = rest / 5;
        rest = rest % 5;
        int notas2 = rest / 2;
        rest = rest % 2;
        int notas1 = rest;
        System.out.println(value);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");

    }

}
