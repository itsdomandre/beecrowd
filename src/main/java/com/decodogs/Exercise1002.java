package com.decodogs;

import java.util.Scanner;

public class Exercise1002 {
    public static void main(String[] args) {
//Calcular a area de um circulo
        Scanner reader = new Scanner(System.in);
        double raio = reader.nextDouble();
        var result = Math.pow(raio, 2) * 3.14159;
        System.out.printf("A=%.4f\n" , result);

    }
}
