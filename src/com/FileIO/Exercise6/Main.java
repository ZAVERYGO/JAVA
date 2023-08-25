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
        String string = Files.readString(path1);
        StringBuffer string2 = new StringBuffer(string);
        Files.writeString(path2, string2.reverse());
    }
}
