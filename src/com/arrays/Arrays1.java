package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите длину массива:");
        int size = console.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = console.nextInt();
        }
        System.out.println("Введите чило смещений:");
        int shift = console.nextInt();
        for (int i = 0; i < shift; i++) {
            int a = array[size - 1];
            for (int j = size - 1; j > 0; j--) {
                array[j] = array[j-1];
            }
            array[0] = a;
        }
        System.out.println(Arrays.toString(array));
    }
}
