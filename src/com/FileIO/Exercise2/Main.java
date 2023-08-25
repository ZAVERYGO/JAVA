package com.FileIO.Exercise2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//2. Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "com", "FileIO", "Exercise1", "text.txt");
        List<String> result = new ArrayList<>();
        List<String> list = Files.readAllLines(path);
        for (String str : list) {
            if (str.isEmpty()) {
                continue;
            }
            String[] string = str.split(" ");
            for (int i = 0; i < string.length; i++) {
                if (isUpperCase(string[i].charAt(0))) {
                    if(string[i].endsWith("?") || string[i].endsWith(",") ||
                            string[i].endsWith(".") || string[i].endsWith("!") ||
                            string[i].endsWith(":") || string[i].endsWith("-") ||
                            string[i].endsWith(";")) {
                        char[] ch = string[i].toCharArray();
                        string[i] = new String(Arrays.copyOf(ch, ch.length - 1));
                    }
                    result.add(string[i]);
                }
            }
        }
        for (int i = 0; i < result.size(); i++) {
            if(result.get(i).isEmpty())
                result.remove(i);
        }
        System.out.println(result);
    }


    public static boolean isUpperCase(char ch) {
        String str = Character.toString(ch);
        return str.equals(str.toUpperCase());
    }
}
