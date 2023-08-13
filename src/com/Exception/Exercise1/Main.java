package com.Exception.Exercise1;
//1. Объявите переменную со значением null. Вызовите метод у этой переменной.
//        Отловите возникшее исключение.
public class Main {
    public static void main(String[] args) {
        String str = null;
        try {
            str.length();
        }catch(NullPointerException e){
            e.printStackTrace();
        }
    }
}
