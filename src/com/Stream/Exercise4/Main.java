package com.Stream.Exercise4;

import java.util.List;
import java.util.stream.Collectors;

/*4. Дан список целых чисел, вывести строку,
        представляющую собой конкатенацию
        строковых представлений этих чисел.
        Пример: список {5, 2, 4, 2, 1}
        Результирующая строка: "52421"*/
public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 2, 4, 2, 1);
        String str = list.stream().
                map(String::valueOf)
                .collect(Collectors.joining(""));
        System.out.println(str);
    }
}
