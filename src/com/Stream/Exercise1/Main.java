package com.Stream.Exercise1;

import java.util.List;

/*1. Дан список целых чисел. Найти среднее всех
        нечётных чисел, делящихся на 5.*/
public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 6, 33, 22, 90, 23, 12, 35, 3, 99);
        list.stream()
                .filter(value -> value % 2 != 0)
                .filter(value -> value % 5 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);
    }
}
