package com.FileIO.Exercise8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//8. Создать программно и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "com", "FileIO", "Exercise8", "sort.txt");
        if(!Files.exists(path)) {
            Files.createFile(path);
        }
        Random random = new Random();
        FileWriter fileWriter = new FileWriter(path.toFile());
        for (int i = 1; i < 400; i++) {
            if (i % 20 == 0) {
                fileWriter.write("\n");
            }
            fileWriter.write(random.nextInt(100) + "\t");
        }
        List<String> list = Files.readAllLines(path);
        StringBuilder string = new StringBuilder();
        for (String s : list) {
            string.append(s);
        }
        String[] str = string.toString().split("\t");

        List<Integer> listString = Arrays.stream(str).
                mapToInt(Integer::valueOf)
                .sorted()
                .boxed()
                .toList();
        fileWriter.write("\n\n");
        for (int i = 1; i < listString.size(); i++) {
            if (i % 20 == 0) {
                fileWriter.write("\n");
            }
            fileWriter.write(listString.get(i) + "\t");
        }
        fileWriter.close();
    }
}