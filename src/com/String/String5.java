package com.String;

import java.util.Arrays;
import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер первого массива:");
        String[] array1 = new String[scan.nextInt()];
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.print("array1[" + i + "]:");
            array1[i] = console.nextLine();
        }
        System.out.println("Введите размер второго массива:");
        String[] array2 = new String[scan.nextInt()];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("array2[" + i + "]:");
            array2[i] = console.nextLine();
        }
        System.out.println(equalsArray(array1, array2));
    }
    public static boolean equalsArray(String[] array1, String[] array2){
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
}
