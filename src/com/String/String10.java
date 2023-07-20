package com.String;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Строка:");
        String str1 = console.nextLine();
        StringBuilder str = new StringBuilder(str1);
        if(str1.equalsIgnoreCase(str.reverse().toString()))
            System.out.println("Строка является палиндромом");
        else
            System.out.println("Не является палиндромом");

    }

}
