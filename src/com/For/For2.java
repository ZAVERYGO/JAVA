package com.For;

import java.util.Scanner;
/*2. Написать программу высчитывающую факториал введённого целого числа.
        Нужно 2 варианта: с циклом и с рекурсией.*/

public class For2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Число:");
        int value = console.nextInt();
        int count = value;
        System.out.println(recurs(value));
        for (int i = 1; i < count; i++) {
            value *= i;
        }
        System.out.println(value);
    }

    public static int recurs(int value) {
        if (value <= 1) {
            return value;
        }
        return recurs(value - 1) * value;
    }
}
