package com.String;

import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Строка:");
        StringBuilder str = new StringBuilder(console.nextLine());
        System.out.println(replacement(str));
    }

    public static StringBuilder replacement(StringBuilder str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                str.deleteCharAt(i);
                i--;
            }
        }
        return str;
    }
}
