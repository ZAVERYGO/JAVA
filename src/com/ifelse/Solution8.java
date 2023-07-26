package com.ifelse;

import java.util.Scanner;

/*8. Написать функцию, которая принимает букву русского алфавита и целое число.
        На выходе функции должен быть символ, которые смещен вправо на переданное число от переданной буквы.*/
public class Solution8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите символ: ");
        String character = console.nextLine();
        System.out.print("Введите число: ");
        int number = console.nextInt();
        System.out.println(shiftToTheRight(character, number));
    }

    public static char shiftToTheRight(String character, int number) {
        String str1 = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String str2 = str1.toUpperCase();
        if (!str1.contains(character)) {
            if (str2.indexOf(character) + number > str2.length() - 1)
                return str2.charAt(str2.indexOf(character) + number - str2.length());
            else
                return str2.charAt(str2.indexOf(character) + number);
        }
        else if (str1.indexOf(character) + number > str1.length() - 1)
            return str1.charAt(str1.indexOf(character) + number - str1.length());
        else
            return str1.charAt(str1.indexOf(character) + number);
    }
}
