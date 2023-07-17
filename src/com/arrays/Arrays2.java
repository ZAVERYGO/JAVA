package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите длину массива:");
        int size = console.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i, console.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                    count++;
                }
            }
            if (count != 0) {
                list.remove(i);
                i--;
            }
        }
        for (int n : list) {
            System.out.print(n + " ");
        }
    }
}
