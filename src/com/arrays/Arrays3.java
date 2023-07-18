package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;
/*3. Заданы 2 массива целых чисел произвольной длины.
        Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных.

        Пример:

        1-й массив: {1, 2, 3, 4, 5}
        2-й массив: {5, 6, 7}

        Результат: {1, 5, 2, 6, 3, 7, 4, 5}*/
public class Arrays3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите длину первого массива:");
        int size1 = console.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < size1; i++) {
            list1.add(i, console.nextInt());
        }
        System.out.print("Введите длину второго массива:");
        int size2 = console.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < size2; i++) {
            list2.add(i, console.nextInt());
        }
        for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
            list3.add(list1.get(i));
            list3.add(list2.get(i));
        }
        if (list1.size() > list2.size())
            for (int i = list2.size(); i < list1.size(); i++)
                list3.add(list1.get(i));
        else if (list1.size() < list2.size())
            for (int i = list1.size(); i < list2.size(); i++)
                list3.add(list2.get(i));

                for (int n :
                        list3) {
                    System.out.print(n + " ");
                }
    }
}

