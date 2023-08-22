package com.Stream.Exercise3;

import java.util.HashMap;
import java.util.Map;

/*3. Дана Map<String, Integer>. Найти сумму всех
        значений, длина ключей которых меньше 7
        символов.*/
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "123456", 1,
                "12345678", 3,
                "123456789", 1,
                "1234567890", 2,
                "1234", 7,
                "1234567", 4,
                "12345", 9);
        int sum = map.entrySet().stream()
                .filter(value -> value.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(sum);

    }
}
