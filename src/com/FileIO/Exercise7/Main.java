package com.FileIO.Exercise7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ChoiceFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*7. Задан файл со стихотворением Александра Пушкина. Определить частоту повторяемости всех букв в стихотворении, игнорируя регистр.
        Вывести результат в файл в виде:
        а - 15
        б - 7
        и т.д.*/
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "com", "FileIO", "Exercise7", "text.txt");
        char[] ch = Files.readString(path).toUpperCase().replace(" ", "")
                .replace("\r", "").replace("\n", "").toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch1 : ch) {
            Integer Count1 = map.get(ch1);
            Integer Count2 = (Count1 == null ? 1 : Count1 + 1);
            map.put(ch1, Count2);
        }
        for (Map.Entry<Character, Integer> character : map.entrySet()) {
            System.out.println(character);
        }
    }
}
