package com.decodogs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int value = reader.nextInt();
        int valueHour = value / 3600;
        value = value % 3600;
        int valueMinute = value / 60;
        value = value % 60;
        int valueSecond = value;
        System.out.println(valueHour + ":" + valueMinute + ":" + valueSecond);

    }

}
