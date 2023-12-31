package com.Collection.Map.Exercise1;

/*1. Задан текст на английском языке. Выделить все различные слова.
        Для каждого слова подсчитать частоту его встречаемости.
        Слова, отличающиеся регистром букв, считать различными.*/
public class Main {
    public static void main(String[] args) {
        String text = "Currently, there are many opportunities offered to those "
        + "people who want to be fit. Fitness clubs and athletic centers are "
        + "available for people of different ages. Also, there are public places "
        + "for physical activities. Students are engaged in special school and "
        + "university programs that guarantee their successful physical development. "
        + "They can participate in different sports to find the most appealing athletic "
        + "activity. Among them are running, swimming, fitness, cycling, football, and yoga, "
        + "to name a few. Regular physical exercises help stimulate muscles and get better "
        + "results in any sport.";
        System.out.println(Util.wordFrequency(text));
        Util.printWord(Util.wordFrequency(text));
    }
}
