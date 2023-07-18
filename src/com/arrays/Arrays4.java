package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество массивов:");
        int size1 = console.nextInt();
        int[][] array = new int[size1][];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите количество элементов " + i + "-го массива:");
            array[i] = new int[console.nextInt()];
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = console.nextInt();
            }
        }
        System.out.println(Arrays.toString(linearize(array)));
    }

    public static int[] linearize(int[][] array) {
        int size = 0;
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            size += array[i].length;
        }
        int[] arrayResult = new int[size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayResult[n] = array[i][j];
                n++;
            }
        }
        return arrayResult;
    }
}
