package com.FileIO.Exercise1;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

//1. Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "com", "FileIO", "Exercise1", "text.txt");
        try (FileInputStream fileInputStream = new FileInputStream(path.toFile())) {
            System.out.println(new String(fileInputStream.readAllBytes()));
        }
        Stream<String> stream = Files.lines(path);
           stream.forEach(System.out::println);
        stream.close();
    }
}
