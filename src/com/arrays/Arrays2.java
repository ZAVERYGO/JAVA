package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

//2. Написать программу, удаляющую все повторяющиеся целые числа из
//        массива и печатающую результат.
public class Arrays2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите длину массива:");
        int[] array = new int[console.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = console.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] == array[j]) {
                    array = arrayBias(array, j);
                    j--;
                    count++;
                }
            }
            if (count != 0) {
                array = arrayBias(array, i);
                i--;
            }
        }
        for (int n : array) {
            System.out.print(n + " ");
        }

    }
    public static int[] arrayBias(int[] array, int k) {
        while (k < array.length - 1) {
            array[k] = array[k + 1];
            k++;
        }
        return Arrays.copyOf(array, array.length - 1);
    }
}
