package com.decodogs;

import java.io.IOException;
import java.util.Scanner; 

public class Exercise1046 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner reader = new Scanner(System.in);
        int beginHour = reader.nextInt();
        int finalHour = reader.nextInt();

        if (beginHour < finalHour) {
            int result = (finalHour - beginHour);
            System.out.println("O JOGO DUROU " + result + " HORA(S)");
        } else if (beginHour == finalHour) {
            int result = 24;
            System.out.println("O JOGO DUROU " + result + " HORA(S)");
        } else {
            int result = (24 - beginHour) + finalHour;
            System.out.println("O JOGO DUROU " + result + " HORA(S)");
        }
 
    }
 
}
