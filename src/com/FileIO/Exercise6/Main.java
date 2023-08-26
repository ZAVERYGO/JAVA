package com.FileIO.Exercise6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

//6. Задан файл с java-кодом. Прочитать текст программы из файла и записать в другой файл в обратном порядке символы каждой строки.
public class Main {
    public static void main(String[] args) throws IOException {
        Path path1 = Path.of("src", "com", "FileIO", "Exercise6", "code1");
        Path path2 = Path.of("src", "com", "FileIO", "Exercise6", "code2");
        List<String> string = Files.readAllLines(path1);
        List<StringBuilder> stringBuilders = new ArrayList<>();
        for (String s : string) {
            StringBuilder str = new StringBuilder(s);
            stringBuilders.add(str.reverse());
        }
        Files.write(path2, stringBuilders);
    }
}
