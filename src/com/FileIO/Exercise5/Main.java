package com.FileIO.Exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/*5. Задан файл с java-кодом. Прочитать текст программы из файла и все слова public
в объявлении атрибутов и методов класса заменить на слово private. Результат сохранить в другой заранее созданный файл.*/
public class Main {
    public static void main(String[] args) throws IOException {
        Path path1 = Path.of("src", "com", "FileIO", "Exercise5", "codePublic");
        Path path2 = Path.of("src", "com", "FileIO", "Exercise5", "codePrivate");
        List<Integer> result = new ArrayList<>();
        String string = Files.readString(path1);
        Files.writeString(path2, string.replace("public", "private"));
    }
}
