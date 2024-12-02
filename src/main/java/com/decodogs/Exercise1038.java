package com.decodogs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise1038 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int code = reader.nextInt();
        int quantity = reader.nextInt();
        if (code==1){
            System.out.printf("Total: R$ %.2f\n", quantity*4.00);
        }else if (code==2){
            System.out.printf("Total: R$ %.2f\n" , quantity*4.5);
        }else if (code==3){
            System.out.printf("Total: R$ %.2f\n" , quantity*5.00);
        }else if (code==4) {
            System.out.printf("Total: R$ %.2f\n", quantity*2.00);
        }else if (code==5){
            System.out.printf("Total: R$ %.2f\n" , quantity*1.50);
        }

    }
}
