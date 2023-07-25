package com.For;

import java.util.Scanner;
/*
10. Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
        Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
        Программа должна выводить:
        a. Количество дней
        b. Сумму осадков за этот период
        c. Среднее количество осадков за этот период
        d. Максимальное количество дневных осадков за этот период
        Не использовать массивы!
*/
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
