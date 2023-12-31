package com.ifelse;

import java.util.Scanner;
/*4*. Написать программу, которая считывает число, месяц и год, введённые пользователем в виде трёх целых чисел.
        Программа должна определять, является ли введённая дата реальной и выводить результат.
        Использовать следующую информацию:
        Январь, март, май, июль, август, октябрь, декабрь - 31 день
        Апрель, июнь, сентябрь, ноябрь - 30 дней
        Февраль - 28 дней в обычный год, 29 дней в високосный*/
public class Solution4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите дату: ");
        int day = console.nextInt();
        int month = console.nextInt();
        int year = console.nextInt();
        if (day > 0 && month > 0 && month <= 12 && year > 0) {
            if (month == 1 || month == 3 || month == 5 || month == 7
                    || month == 8 || month == 10 || month == 12)
                if (day <= 31)
                    System.out.printf("Такая дата существует - %d.%d.%d", day, month, year);
                else
                    System.out.printf("Такой даты не существует - %d.%d.%d", day, month, year);
            else if (month == 2)
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                    if (day <= 29)
                        System.out.printf("Такая дата существует - %d.%d.%d", day, month, year);
                    else
                        System.out.printf("Такой даты не существует - %d.%d.%d", day, month, year);
                else if (day <= 28)
                    System.out.printf("Такая дата существует - %d.%d.%d", day, month, year);
                else
                    System.out.printf("Такой даты не существует - %d.%d.%d", day, month, year);
            else if (day <= 30)
                System.out.printf("Такая дата существует - %d.%d.%d", day, month, year);
            else
                System.out.printf("Такой даты не существует - %d.%d.%d", day, month, year);
        }
        else
            System.out.printf("Такой даты не существует - %d.%d.%d", day, month, year);
    }
}
