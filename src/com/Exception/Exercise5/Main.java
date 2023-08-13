package com.Exception.Exercise5;
//5. Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное, указав в качестве причины отловленное.

import com.Exception.Exercise4.Exercise4Exception;

public class Main {
    public static void main(String[] args) {
        try {
            exc1();
        }catch(Exercise4Exception e) {
            e.printStackTrace();
        }
    }
    public static void exc1(){
        try {
            exc();
        }catch(RuntimeException e){
            throw new Exercise4Exception(e);
        }
    }
    public static void exc(){
        throw new RuntimeException();
    }
}
