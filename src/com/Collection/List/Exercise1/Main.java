package com.Collection.List.Exercise1;

import java.util.ArrayList;
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
        List<String> list = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        System.out.println(markLength4(list));
    }
    public static List<String> markLength4(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).trim().length() == 4) {
                list.add(i, "****");
                i++;
            }
        }
        return list;
    }
}

