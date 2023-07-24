package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*3. Заданы 2 массива целых чисел произвольной длины.
        Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных.

        Пример:

        1-й массив: {1, 2, 3, 4, 5}
        2-й массив: {5, 6, 7}

        Результат: {1, 5, 2, 6, 3, 7, 4, 5}*/
public class Arrays3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите длину первого массива:");
        int[] array1 = new int[console.nextInt()];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("array1[" + i + "] = ");
            array1[i] = console.nextInt();
        }
        System.out.print("Введите длину второго массива:");
        int[] array2 = new int[console.nextInt()];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("array[" + i + "] = ");
            array2[i] = console.nextInt();
        }
        int[] array3 = new int[array1.length + array2.length];
        int count = 0;
        for (int i = 0; i < Math.min(array1.length, array2.length); i++) {
            array3[count++] = array1[i];
            array3[count++] = array2[i];
        }
        if (array1.length > array2.length) {
            for (int i = array2.length; i < array1.length; i++) {
                array3[i + array2.length] = array1[i];
            }
        } else if (array1.length < array2.length) {
            for (int i = array1.length; i < array2.length; i++) {
                array3[i + array1.length] = array2[i];
            }
        }
        System.out.println(Arrays.toString(array3));
    }
}



