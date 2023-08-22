package com.Stream.Exercise2;

import java.util.List;
import java.util.stream.Collectors;

/*2. Дан список строк. Найти количество уникальных
        строк длиной более 8 символов.*/
public class Main {
    public static void main(String[] args) {
        List<String> list = List.of(
                "123456789"
        , "12345"
        , "123456789"
        , "12345"
        , "1234567890"
        , "1234567");
        int count = list.stream()
                .filter(str -> str.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(count);
    }
}
