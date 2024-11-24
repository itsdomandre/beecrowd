package org.example;

import java.util.Scanner;

public class Exercise1021 {
    public static void main(String[] args) {
//        Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
//
//        Entrada
//        O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
//
//        Saída
//        Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

        Scanner reader = new Scanner(System.in);

        double value = reader.nextDouble();
        double rest = value;
        double notas100 = rest / 100;
        rest = rest % 100;
        double notas50 = rest / 50;
        rest = rest % 50;
        double notas20 = rest / 20;
        rest = rest % 20;
        double notas10 = rest / 10;
        rest = rest % 10;
        double notas5 = rest / 5;
        rest = rest % 5;
        double notas2 = rest / 2;
        rest = rest % 2;
        int cents = (int) Math.round(rest * 100);
        int coin1 = cents / 100;
        cents = cents % 100;
        int coin050 = cents / 50;
        cents = cents % 50;
        int coin025 = cents / 25;
        cents = cents % 25;
        int coin010 = cents / 10;
        cents = cents % 10;
        int coin005 = cents / 5;
        cents = cents    % 5;
        int coin001 = cents;

        System.out.println("NOTAS:");
        System.out.println((int) notas100 + " nota(s) de R$ 100.00");
        System.out.println((int) notas50 + " nota(s) de R$ 50.00");
        System.out.println((int) notas20 + " nota(s) de R$ 20.00");
        System.out.println((int) notas10 + " nota(s) de R$ 10.00");
        System.out.println((int) notas5 + " nota(s) de R$ 5.00");
        System.out.println((int) notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)coin1 + " moeda(s) de R$ 1.00");
        System.out.println((int)coin050 + " moeda(s) de R$ 0.50");
        System.out.println((int)coin025 + " moeda(s) de R$ 0.25");
        System.out.println((int)coin010 + " moeda(s) de R$ 0.10");
        System.out.println((int)coin005 + " moeda(s) de R$ 0.05");
        System.out.println((int)coin001 + " moeda(s) de R$ 0.01");

    }
}
