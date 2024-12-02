package com.decodogs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise1037 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double value = reader.nextDouble();
        if (value<=100 && value>75){
            System.out.println("Intervalo (75,100]");
        }else if (value <=75 && value>50){
            System.out.println("Intervalo (50,75]");
        }else if(value <=50 && value>25){
            System.out.println("Intervalo (25,50]");
        }else if (value<=25 && value >=0){
            System.out.println("Intervalo [0,25]");
        }else{
            System.out.println("Fora de intervalo");
        }
    }
}
