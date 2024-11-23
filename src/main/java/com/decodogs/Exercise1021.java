package org.example;

import java.util.Scanner;

public class Exercise1021 {
    public static void main(String[] args) {
//        Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
//
//                Entrada
//        O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
//
//        Saída
//        Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

        Scanner reader = new Scanner(System.in);

        double value = reader.nextDouble(); // 587
        double rest = value; // rest = 588.73
        double notas100 = rest / 100; // 5
        rest = rest % 100; // 87
        double notas50 = rest / 50; // 1
        rest = rest % 50; // 37
        double notas20 = rest / 20;
        rest = rest % 20; // 18
        double notas10 = rest / 10;
        rest = rest % 10; // 8
        double notas5 = rest / 5;
        rest = rest % 5; // 3
        double notas2 = rest / 2;
        rest = rest % 2; // 1
        double coin1 = rest / 1;
        rest = rest % 1;
        double coin050 = rest / 0.50;
        rest = rest % 0.50;
        double coin025 = rest / 0.25;
        rest = rest % 0.25;
        double coin010 = rest / 0.10;
        rest = rest % 0.10;
        double coin005 = rest / 0.05;
        rest = rest % 0.05;
        double coin001 = rest / 0.01;
        rest = rest % 0.01;

        System.out.println("NOTAS:");
        System.out.println((int) notas100 + " nota(s) de 100.00");
        System.out.println((int) notas50 + " nota(s) de 50.00");
        System.out.println((int) notas20 + " nota(s) de 20.00");
        System.out.println((int) notas10 + " nota(s) de 10.00");
        System.out.println((int) notas5 + " nota(s) de 5.00");
        System.out.println((int) notas2 + " nota(s) de 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)coin1 + " moeda(s) de 1.00");
        System.out.println((int)coin050 + " moeda(s) de 0.50");
        System.out.println((int)coin025 + " moeda(s) de 0.25");
        System.out.println((int)coin010 + " moeda(s) de 0.10");
        System.out.println((int)coin005 + " moeda(s) de 0.05");
        System.out.println((int)coin001 + " moeda(s) de 0.01");

    }
}
