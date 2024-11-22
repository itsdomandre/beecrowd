package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
//
//                Entrada
//        O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
//
//        Saída
//        Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
      
        Scanner reader = new Scanner(System.in);

        int value = reader.nextInt(); // 587
        int rest = value; // rest = 587
        int notas100 = rest / 100; // 5
        rest = rest % 100;
        int notas50 = rest / 50;
        rest = rest % 50;
        int notas20 = rest / 20;
        rest = rest % 20;
        int notas10 = rest / 10;
        rest = rest % 10;
        int notas5 = rest /5;
        rest = rest % 5;
        int notas2 = rest / 2;
        rest = rest % 2;


        System.out.println(notas100 + " notas de 100.00");
        System.out.println(notas50+ " notas de 50.00");
        System.out.println(notas20 + " notas de 20.00");
        System.out.println(notas10 + " notas de 10.00");
        System.out.println(notas5 + " notas de 5.00");
        System.out.println(notas2 + " notas de 2.00");
        // TODO: Continua a tratar das moedas

    }

}
