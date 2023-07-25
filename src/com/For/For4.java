package com.For;
/*4. Написать программу, которая проходит циклом по английскому алфавиту, начиная
с буквы ‘b’, и выводит каждую букву до тех пор, пока не встретит гласную (т.е. вывести согласные на консоль).
        (Второй вариант: до второй гласной)*/
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
