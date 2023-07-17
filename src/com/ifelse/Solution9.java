package com.ifelse;

import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите дату: ");
        int day = console.nextInt();
        int month = console.nextInt();
        int year = console.nextInt();
        day++;
        if (day > 0 && month > 0 && month <= 12 && year > 0) {
            if (month == 1 || month == 3 || month == 5 || month == 7
                    || month == 8 || month == 10 || month == 12) {
                if (day > 31 && month == 12) {
                    year++;
                    month = 1;
                    day = 1;
                } else if (day > 31) {
                    month++;
                    day = 1;
                }
            } else if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    if (day > 29) {
                        month++;
                        day = 1;
                    }
                } else if (day > 28) {
                    month++;
                    day = 1;
                }
            } else if (day > 30) {
                month++;
                day = 1;
            }
        }
        date(day, month, year);
    }

    public static void date(int day, int month, int year) {
        System.out.printf("%d.%d.%d", day, month, year);
    }
}


