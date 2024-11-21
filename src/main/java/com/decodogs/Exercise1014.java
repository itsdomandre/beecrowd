package com.decodogs;

import java.util.Scanner;

public class Exercise1014 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int kmTotal = reader.nextInt();
        double gasTotal = reader.nextDouble();
        var result = kmTotal/gasTotal;
        System.out.printf("%.3f km/l\n", result);

    }
}
