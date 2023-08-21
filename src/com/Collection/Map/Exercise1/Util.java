package com.Collection.Map.Exercise1;

import java.util.HashMap;
import java.util.Map;

public class Util {
    private static final String EMPTY = "";
    private static final String SPACE = " ";

    public static Map<String, Integer> wordFrequency(String text) {
        Map<String, Integer> resultMap = new HashMap<>();
        String[] words = text.replace(".", EMPTY).replace(",", EMPTY).replace("!", EMPTY).split(SPACE);
        for (String word : words) {
            Integer Count1 = resultMap.get(word);
            Integer Count2 = (Count1 == null ? 1 : Count1 + 1);
            resultMap.put(word, Count2);
        }
        return resultMap;
    }
    public static void printWord(Map<String, Integer> map){
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if(stringIntegerEntry.getValue() > 1){
                System.out.print(stringIntegerEntry + " ");
            }
        }
    }
}
