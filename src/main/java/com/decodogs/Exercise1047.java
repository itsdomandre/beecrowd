package com.decodogs;

import java.util.Scanner;

public class Exercise1047 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int beginHour = reader.nextInt();
        int beginMinute = reader.nextInt();
        int finalHour = reader.nextInt();
        int finalMinute = reader.nextInt();

        int resultHour = finalHour - beginHour;
        int resultMinutes = finalMinute - beginMinute;

//        Available scenarios
//        beginHour == finalHour && beginMinute == finalMinute
//        beginHour == finalHour && beginMinute < finalMinute
//        beginHour == finalHour && beginMinute > finalMinute
//
//        beginHour < finalHour && beginMinute == finalMinute
//        beginHour < finalHour && beginMinute < finalMinute
//        beginHour < finalHour && beginMinute > finalMinute
//
//        beginHour > finalHour && beginMinute == finalMinute
//        beginHour > finalHour && beginMinute < finalMinute
//        beginHour > finalHour && beginMinute > finalMinute

    }
}
