package com.Colltction.List.Solution1;

import java.util.Arrays;
import java.util.List;

/*
1. Написать метод markLength4, принимающий в качестве параметра список (List) строк и размещающий строку "****"
        перед каждым четырёхсимвольным элементом. Оригинальные элементы должны остаться на месте.
        Например:
        {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}
        ->
        {"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****", "Java", "programmer"}*/
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer");
        for (String str : list) {
            if (str.trim().length() == 4) {
                list.add(list.indexOf(str), "****");
            }
        }
        // rf
        System.out.println(list);
    }
}
