package com.Exception.Exercise4;

/*4. Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
        Добавить в конструктор своего класса возможность указания сообщения.*/

public class Main {
    public static void main(String[] args) {
            exc();
    }
    public static void exc(){
        throw new Exercise4Exception("massage");
    }
}
