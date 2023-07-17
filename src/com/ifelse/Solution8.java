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

    public static String shiftToTheRight(String character, int number) {
        for (int i = 0; i < number; i++) {
            character = " " + character;
        }
        return character;
    }
}
