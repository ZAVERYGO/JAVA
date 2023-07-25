package com.For;

import java.util.Scanner;
/*9. Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
        Решить двумя способами: с помощью цикла и с помощью рекурсии.*/
public class For9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Число:");
        int value = console.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.print(num1 + " " + num2 + " ");
        while (true) {
            num3 = num2 + num1;
            if(num3 > value)
                break;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
}
