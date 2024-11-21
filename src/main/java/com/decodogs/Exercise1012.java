package com.decodogs;

import java.util.Scanner;

public class Exercise1012 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Double valueA = reader.nextDouble();
        Double valueB = reader.nextDouble();
        Double valueC = reader.nextDouble();
        var trianguloRetResult = valueA*valueC / 2;
        var circuloResult = Math.pow(valueC, 2) * 3.14159;
        var trapezioResult = (valueA+valueB)/2 * valueC;
        var quadradoResult = Math.pow(valueB, 2);
        var retanguloResult = valueA*valueB;
        System.out.printf("TRIANGULO: %.3f\n" , trianguloRetResult);
        System.out.printf("CIRCULO: %.3f\n" , circuloResult);
        System.out.printf("TRAPEZIO: %.3f\n" , trapezioResult);
        System.out.printf("QUADRADO: %.3f\n" , quadradoResult);
        System.out.printf("RETANGULO: %.3f\n" , retanguloResult);

    }
}
