package com.FileIO.Exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

//4. Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "com", "FileIO", "Exercise4", "text.txt");
        List<Integer> result = new ArrayList<>();
        List<String> list = Files.readAllLines(path);
        for (String str : list) {
            int max = 0, count = 0;
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (isNumber(ch[i])) {
                    count++;
                }
                else{
                    count = 0;
                }
                if (max < count) {
                    max = count;
                }
            }
            result.add(max);
        }
        System.out.println(result);
    }

    public static boolean isNumber(char character) {
        String string = Character.toString(character);
        return "0123456789".contains(string);
    }
}
