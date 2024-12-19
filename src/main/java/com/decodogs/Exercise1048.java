package com.decodogs;

import java.util.Scanner;

public class Exercise1048 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        float salary = reader.nextFloat();
        int percIncrease;

        if (salary <= 400) {
            percIncrease = 15;
        } else if (salary > 400 && salary <= 800) {
            percIncrease = 12;
        } else if (salary > 800 && salary <= 1200) {
            percIncrease = 10;
        } else if (salary > 1200 && salary <= 2000) {
            percIncrease = 7;
        } else {
            percIncrease = 4;
        }

        float adjustSalary = (salary * percIncrease) / 100;
        float newSalary = salary + adjustSalary;
        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", adjustSalary);
        System.out.printf("Em percentual: %d %%\n", percIncrease);

    }

}
