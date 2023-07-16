package com.ifelse;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите сумму:");
        String str = console.nextLine();
        str = " " + str;
        if ("11".equals(str.substring(str.length() - 2)) ||
                "12".equals(str.substring(str.length() - 2)) ||
                "13".equals(str.substring(str.length() - 2)) ||
                "14".equals(str.substring(str.length() - 2)) ||
                "5".equals(str.substring(str.length() - 1))  ||
                "6".equals(str.substring(str.length() - 1))  ||
                "7".equals(str.substring(str.length() - 1))  ||
                "8".equals(str.substring(str.length() - 1))  ||
                "9".equals(str.substring(str.length() - 1))  ||
                "0".equals(str.substring(str.length() - 1)))
            System.out.println(str + " рублей");
        else if ("1".equals(str.substring(str.length() - 1)))
            System.out.println(str + " рубль");
        else
            System.out.println(str + " рубля");

    }
}
