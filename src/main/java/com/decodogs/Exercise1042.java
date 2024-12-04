package com.decodogs;

import java.util.Scanner;

public class Exercise1042 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        if (a < b && b < c) {
            System.out.printf(a + "\n" + b + "\n" + c + "\n");
        } else if (a < c && c < b) {
            System.out.printf(a + "\n" + c + "\n" + b + "\n");
        } else if (b < a && a < c) {
            System.out.printf(b + "\n" + a + "\n" + c + "\n");
        } else if (b < c && c < a) {
            System.out.printf(b + "\n" + c + "\n" + a + "\n");
        } else if (c < a && a < b) {
            System.out.printf(c + "\n" + a + "\n" + b + "\n");
        } else if (c < b && b < a) {
            System.out.printf(c + "\n" + b + "\n" + a + "\n");
        }
        System.out.printf("\n" + a + "\n" + b + "\n" + c + "\n");

    }
}
