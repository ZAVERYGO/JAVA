package com.ifelse;

import java.util.Scanner;
/*6. Написать функцию, которая принимает один целочисленный параметр и возвращает значение,
        равное этому параметру, возведенному в куб.*/
public class Solution6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число: ");
        int value = console.nextInt();
        System.out.println(cube(value));
    }

    public static int cube(int value) {
        return (int) Math.pow(value, 3);
    }
}
