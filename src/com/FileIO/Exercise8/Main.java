package com.FileIO.Exercise8;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

//8. Создать программно и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "com", "FileIO", "Exercise8", "sort.txt");
        if(!Files.exists(path)) {
            Files.createFile(path);
        }
        Random random = new Random();
        FileWriter fileWriter = new FileWriter(path.toFile());
        for (int i = 0; i < 400; i++) {
            if (i % 20 == 0) {
                fileWriter.write("\n");
            }
            fileWriter.write(random.nextInt(100) + "\t");
            //fileWriter.write("\t" + random.nextInt(100));    NumberFormatException
        }
        fileWriter.close();
        List<String> list = Files.readAllLines(path);
        StringBuilder string = new StringBuilder();
        for (String s : list) {
            string.append(s);
        }
        //String string = String.join("\t", list);
        String[] str = string.toString().split("\t");

        List<Integer> listString = Arrays.stream(str).
                mapToInt(Integer::valueOf)
                .sorted()
                .boxed()
                .toList();
        // toList() NumberFormatException
        FileWriter fileWriter2 = new FileWriter(path.toFile(), true);
        fileWriter2.write("\n\n");
        for (int i = 0; i < listString.size(); i++) {
            if (i % 20 == 0) {
                fileWriter2.write("\n");
            }
            fileWriter2.write(listString.get(i) + "\t");
            //fileWriter2.write("\t" + listString.get(i));   NumberFormatException
        }
        fileWriter2.close();
    }
}