package com.ifelse;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int year = console.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + " год - високосный");
        else
            System.out.println(year + " год - не високосный");
    }
}
