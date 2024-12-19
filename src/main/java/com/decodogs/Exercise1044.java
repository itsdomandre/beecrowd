package com.decodogs;

import java.util.Scanner;

public class Exercise1044 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();

        if (b % a == 0 || a % b == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

    }

}
