package com.For;

import java.util.Scanner;
/*5. Имеется последовательность случайных чисел. Найти и вывести наибольшее из них.*/
public class For5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите длину массива:");
        int size = console.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = console.nextInt();
        }
        int max = array[0];
        for (int j : array) {
            if (j > max)
                max = j;
        }
        System.out.println(max);
    }
}
