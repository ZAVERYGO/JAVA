package com.For;

import java.util.Scanner;
/*7*. Имеется целое число. Вывести его в бухгалтерском формате.
        Т.е., начиная справа, каждые три позиции отделяются пробелом.
        Например 20023143 должно быть выведено как 20 023 143*/
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
