package com.ifelse;

import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число: ");
        int value = console.nextInt();
        System.out.println(lastCharThree(value));
    }

    public static String lastCharThree(int value) {
        if ((value - 3) % 10 == 0)
            return "Последня цифра является тройкой";
        else
            return "Последняя цифра не является тройкой";
    }
}
