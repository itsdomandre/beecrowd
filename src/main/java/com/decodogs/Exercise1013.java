package com.decodogs;

import java.util.Scanner;

public class Exercise1013 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int valueA = reader.nextInt();
        int valueB = reader.nextInt();
        int valueC = reader.nextInt();
        var maiorAB = (valueA + valueB + Math.abs(valueA - valueB)) /2;
        var maiorABC = (maiorAB + valueC + Math.abs(maiorAB - valueC)) / 2;
        System.out.println(maiorABC + " eh o maior");

    }
}
