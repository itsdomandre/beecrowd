package com.decodogs;

public class Test{
    public static void main (String[] args){
        var a = 5;
        var b = 2;
        var c = 7;

        if (a > b && b > c)
            System.out.printf("%d %d %d" , a , b , c);
        if (a > c && c > b)
            System.out.printf("%d %d %d" , a , c , b);
        if (b > a && a > c)
            System.out.printf("%d %d %d" , b , a , c);
        if (b > c && c > a)
            System.out.printf("%d %d %d" , b , c , a);
        if (c > a && a > b)
            System.out.printf("%d %d %d" , c , a , b);
        if (c > b && b > a)
            System.out.printf("%d %d %d" , c , b , a);
    }
}