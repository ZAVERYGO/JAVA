package com.Exception.Exercise6;

/*6. Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
        Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.*/
public class Main {
    public static void main(String[] args) {
        try{
            random();
        }catch(Throwable e){
            e.printStackTrace();
        }
    }

    public static void random() {
        switch ((int)(Math.random() * 3 + 1)) {
            case (1):
                throw new NullPointerException();
            case (2):
                throw new ArrayIndexOutOfBoundsException();
            case (3):
                throw new ArithmeticException();
        }
    }
}
