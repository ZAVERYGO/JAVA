package com.Exception.Exercise7;

import java.io.File;

/*7. Написать метод, который в 50% случаев бросает исключение.
        Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally.*/
public class Main {
    public static void main(String[] args) {
        try {
            random();
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("massage");
        }
    }

    public static void random() {
        if ((int)(Math.random() * 2) == 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            throw new NullPointerException();
        }
        }
    }


