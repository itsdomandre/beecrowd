package com.decodogs;

import java.util.Scanner;

public class Exercise1017 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int totalTime = reader.nextInt();
        int averageSpeed = reader.nextInt();
        double result =  (double) (totalTime * averageSpeed) / 12;
        System.out.printf("%.3f\n",result);

    }
}
