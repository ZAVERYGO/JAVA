package com.For;

public class For4 {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == 'e')
                break;
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == 'i')
                break;
            System.out.print(str.charAt(i) + " ");
        }
    }
}
