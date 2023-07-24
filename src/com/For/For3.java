package com.For;

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("число:");
        int value = console.nextInt();
        if (value > 1 && value % 2 != 0 && value % 3 != 0 && value % 5 != 0 || value == 2 || value == 3 || value == 5)
            System.out.println("Число является простым");
        else
            System.out.println("Число не является простым");
        /*int n = 1;
        int count = 0;
        while (n <= value) {
            if (value % n == 0)
                count++;
            n++;
        }
        if (count == 2)
            System.out.println(value + " - простое число");
        else
            System.out.println(value + " - не простое число");*/
    }
}

