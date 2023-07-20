
package com.String;

//6. Подсчитать количество всех точек, запятых и восклицательных знаков в строке.
public class String6 {
    public static void main(String[] args) {
    String str = "h4r.,f ,.fre!,h1!.,e";
    int points = 0;
    int commas = 0;
    int exclamationPoint = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '.')
                points++;
            if(str.charAt(i) == ',')
                commas++;
            if(str.charAt(i) == '!')
                exclamationPoint++;
        }
        System.out.println("Количество точек:" + points);
        System.out.println("Количество запятых:" + commas);
        System.out.println("Количество восклицательных знаков:" + exclamationPoint);
    }
}

