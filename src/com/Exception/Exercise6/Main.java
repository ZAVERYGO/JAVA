package com.Exception.Exercise6;

/*6. Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
        Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.*/
public class Main {
    public static void main(String[] args) {
        try{
            random(5);
        }catch(Throwable e){
            e.printStackTrace();
        }
    }


        public static void random(int size) {
            switch ((int) (Math.random() * size + 1)) {
                case (1) -> throw new NullPointerException();
                case (2) -> throw new ArrayIndexOutOfBoundsException();
                case (3) -> throw new ArithmeticException();
            }
    }

}
