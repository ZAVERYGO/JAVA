package com.For;

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Количество дней: ");
        int N = console.nextInt();
        int sum = 0;
        int max = 0;
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " день - ");
            int day = console.nextInt();
            sum += day;
            if(day > max) {
                max = day;
            }
        }
        System.out.println("Количество дней: " + N);
        System.out.println("Сумму осадков за этот период: " + sum);
        System.out.println("среднее количество осадков за период: " + (double)sum / N);
        System.out.println("Максимальное количество дневных осадков за этот период: " +  max);
    }
}
