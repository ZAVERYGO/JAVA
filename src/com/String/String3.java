package com.String;

import java.util.Scanner;

/*
3. Написать функцию, принимающую 2 параметра:
        строку и слово - и возвращающую true, если строка начинается и заканчивается этим словом.
*/
public class String3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ввведите строку:");
        String str = console.nextLine();
        System.out.println("Введите слово:");
        String word = console.nextLine();
        System.out.println(startEnd(str, word));
    }

    public static boolean startEnd(String str, String word) {
        if (str.startsWith(word) && str.endsWith(word)) {
            if ((str.charAt(str.indexOf(word) + word.length()) == ' ') && (str.charAt(str.lastIndexOf(word) - 1) == ' '))
                return true;
            else
                return false;
        } else
            return false;
    }
}
