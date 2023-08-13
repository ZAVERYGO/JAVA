package com.Exception.Exercise2;
//2. Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            System.out.println(array[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
