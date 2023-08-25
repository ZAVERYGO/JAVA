package com.FileIO.Exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.FileIO.Exercise2.Main2;

//3. Задан файл с текстом, найти и вывести в консоль все слова,  для которых последняя буква одного слова совпадает с первой буквой следующего слова
public class Main3 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "com", "FileIO", "Exercise1", "text.txt");
        List<String> result = new ArrayList<>();
        List<String> list = Files.readAllLines(path);
        for (String str : list) {
            if (str.isEmpty()) {
                continue;
            }
            String[] string = str.split(" ");
            for (int i = 0; i < string.length - 1; i++) {
                if (Main2.punctuationMarks(string[i])) {
                    char[] ch = string[i].toCharArray();
                    string[i] = new String(Arrays.copyOf(ch, ch.length - 1));
                }
                if (string[i].endsWith(Character.toString(string[i + 1].charAt(0)))) {
                    result.add(string[i]);
                }
            }

        }
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).isEmpty()) {
                result.remove(i);
                i--;
            }
        }
        System.out.println(result);
    }
}

