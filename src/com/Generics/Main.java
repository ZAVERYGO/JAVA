package com.Generics;
/*1. Создать класс Pair, параметризованный двумя параметрами K и V. Класс должен хранить две переменные типов K и V соответственно.
        У класса должен быть конструктор, принимающий 2 параметра типов K и V, а также набор соответствующих геттеров/сеттеров.

        2. Создать статический обобщённый метод swap в final классе PairUtil.
        Метод должен принимать объект класса Pair и возвращать пару, в которой элементы поменяны местами.
*/
public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("qwerty", 2);
        System.out.println(pair);
        System.out.println(PairUtil.swap(pair));
    }
}
