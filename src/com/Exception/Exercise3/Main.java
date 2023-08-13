package com.Exception.Exercise3;
/*
3. Создать собственный класс-исключение - наследник класса Exception.
        Создать метод, выбрасывающий это исключение.
        Вызвать этот метод и отловить исключение. Вывести stack trace в консоль.
*/
public class Main {
    public static void main(String[] args) {
        try {
            exc();
        } catch (Exercise3Exception e) {
            e.printStackTrace();
        }
    }
    public static void exc() throws Exercise3Exception{
        throw new Exercise3Exception();
    }
}
