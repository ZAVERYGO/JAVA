package com.FileIO.Exercise2;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

//2. Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "com", "FileIO", "Exercise1", "text.txt");
        List<String> list = Files.readAllLines(path);
        list.stream()
                .map(str -> str.)
    }
}
