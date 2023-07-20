package com.String;

import java.util.Scanner;
//8. Подсчитать количество слов в тексте.
//        Учесть, что слова могут разделяться несколькими пробелами.
public class String8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Строка:");
        String str0 = console.nextLine();
        String str = str0.trim();
        int count = 0;
        if(str.length() != 0)
            count++;
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
                continue;
            if(str.charAt(i) == ' ')
                count++;
        }
        System.out.println(count);
    }
}
