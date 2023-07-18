package com.String;
/*1. Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
        второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.*/
public class String1 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String str1 = "Же";
        for (int i = 0; i < 1000; i++) {
            str1 += "ка";
        }
        /*StringBuilder str1 = new StringBuilder("Же");
        for (int i = 0; i < 1000; i++) {
            str1.append("ка");
        }*/
        long time = System.nanoTime() - startTime;
        System.out.println(time);
        System.out.println(str1);
    }
}
