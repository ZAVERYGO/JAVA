package com.ifelse;

import java.util.Scanner;
//5. Написать функцию, которая принимает 2 целочисленных параметра, и возвращает наибольший из них.
public class Solution5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите числа: ");
        int firstValue = console.nextInt();
        int secondValue = console.nextInt();
        System.out.println(maxValue(firstValue, secondValue));
    }

    public static int maxValue(int firstValue, int secondValue) {
        return firstValue > secondValue ? firstValue:secondValue;
    }
}
