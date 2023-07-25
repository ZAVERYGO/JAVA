package com.For;

import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("число:");
        int value = console.nextInt();
        int sum = 0;
        while (value != 0) {
              sum += value % 10;
              value /= 10;
        }
        System.out.println(sum);
    }
}
