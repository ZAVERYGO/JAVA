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
            return (str.charAt(word.length()) == ' ') && (str.charAt(str.length() - word.length() - 1) == ' ');
        } else
            return false;
    }
}
