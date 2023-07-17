package com.ifelse;

import java.util.Scanner;
/*
3. Запросить у пользователя 2 слова. Если они одинаковы - вывести "Отлично! Слова одинаковы".
        Если они отличаются лишь регистром - "Хорошо. Почти одинаковы"
        Если они отличаются, но одной длины - "Ну, хотя бы они одной длины"
        Использовать методы класса String: equals(String string), equalsIgnoreCase(String string), length()
*/
public class Solution3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите первое слово:");
        String firstWord = console.nextLine();
        System.out.print("Введите второе слово:");
        String secondWord = console.nextLine();
        if (firstWord.equals(secondWord))
            System.out.println("Отлично! Слова одинаковы");
        else if (firstWord.equalsIgnoreCase(secondWord))
            System.out.println("Хорошо. Почти одинаковы");
        else if (firstWord.length() == secondWord.length())
            System.out.println("Ну, хотя бы они одной длины");
    }
}
