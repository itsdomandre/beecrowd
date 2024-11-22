package com.decodogs;

import java.util.Scanner;

public class Exercise1020 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int age = reader.nextInt();
        int years = age/365;
        int daysAfterYear = age % 365 ;
        int months = daysAfterYear/30;
        int daysAfterMonth = daysAfterYear % 30 ;
        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(daysAfterMonth + " dia(s)");

    }

}
