package com.decodogs;

import java.util.Scanner;

public class Exercise1011 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        double R = reader.nextDouble();
        var result = 4.0/3 * 3.14159 * Math.pow(R, 3);
        System.out.printf("VOLUME = %.3f\n " , result);
    }
}
