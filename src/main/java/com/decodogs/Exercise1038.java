package com.decodogs;

import java.util.Scanner;

public class Exercise1038 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        float n1 = reader.nextFloat();
        float n2 = reader.nextFloat();
        float n3 = reader.nextFloat();
        float n4 = reader.nextFloat();
        float average = ((n1*2) + (n2*3) + (n3*4) + (n4)) / 10;
        
        System.out.printf("Media: %.1f\n", average);
        if (average >= 7) {
            System.out.printf("Aluno aprovado.\n");
        } else if (average < 5) {

            System.out.printf("Aluno reprovado.\n");
        } else {
            System.out.printf("Aluno em exame.\n");
            float finalExam = reader.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", finalExam);
            float finalAverage = (average + finalExam) / 2;
            if (finalAverage >= 5) {
                System.out.printf("Aluno aprovado.\n");
            } else {
                System.out.printf("Aluno reprovado.\n");
            }
            System.out.printf("Media final: %.1f\n", finalAverage);
        }
    }
}

// Diff between use Float and Double in "round case"