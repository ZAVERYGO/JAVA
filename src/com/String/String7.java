package com.String;

import java.util.Arrays;
import java.util.Scanner;

//7.написать функцию, разбивающую строку на равные части по n символов и
// сохраняющую отдельные части в массив. Вывести этот массив.

public class String7 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = console.nextLine();
        System.out.println("Введите n:");
        int n = console.nextInt();
        System.out.println(Arrays.toString(divide(str, n)));
    }
    public static String[] divide(String str, int n){
        int end = n;
        int start = 0;
        String[] array = new String[(int) Math.ceil(str.length() / (double) n)];
        for (int i = 0; i < str.length() / n; i++) {
            array[i] = str.substring(start, end);
            end += n;
            start += n;
        }
        array[array.length - 1] = str.substring(end - n);
        return array;
    }
}

