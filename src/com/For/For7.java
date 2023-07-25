package com.For;

import java.util.Scanner;

public class For7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Число: ");
        String str = console.nextLine();
        StringBuilder builder = new StringBuilder(str.trim());
            for (int i = builder.length() - 3; i >= 0; i -= 3) {
                builder.insert(i, ' ');
            }
        System.out.println(builder);
    }
}
