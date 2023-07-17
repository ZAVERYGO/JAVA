package com.ifelse;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размеры первого дома:");
        int a = console.nextInt();
        int b = console.nextInt();
        System.out.println("Введите размеры второго дома:");
        int c = console.nextInt();
        int d = console.nextInt();
        System.out.println("Введите размеры участка:");
        int e = console.nextInt();
        int f = console.nextInt();
        if((a + c <= e && b + d <= f) || (b + d <= e && a + c <= f) ||
                (a + d <= e && b + c <= f) || (b + c <= e && a + d <= f))
            System.out.println("Дома помещаются");
        else
            System.out.println("Дома не помещаются");
    }
}
